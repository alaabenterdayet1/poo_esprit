import java.util.*;
import java.util.stream.Collectors;

public class Entreprise {
    private List<Prestation> prestations = new ArrayList<>();

    // Ajouter une prestation
    public void ajouterPrestation(Prestation p) throws PrestationExisteException {
        if (prestations.contains(p)) {
            throw new PrestationExisteException("La prestation existe déjà.");
        }
        prestations.add(p);
    }

    // Afficher le nombre de prestations pour chaque type
    public void afficherNbrPrestation() {
        long nbrProduits = prestations.stream().filter(p -> p instanceof Produit).count();
        long nbrServices = prestations.stream().filter(p -> p instanceof Service).count();
        System.out.println("Produits: " + nbrProduits);
        System.out.println("Services: " + nbrServices);
    }

    // Filtrer les prestations par client
    public List<Prestation> prestationparClient(String client) {
        return prestations.stream()
                .filter(p -> p.getNomClient().equals(client))
                .collect(Collectors.toList());
    }

    // Filtrer les prestations par client (avec regroupement)
    public Map<String, List<Prestation>> filterParClient() {
        return prestations.stream()
                .collect(Collectors.groupingBy(Prestation::getNomClient));
    }

    // Afficher les clients triés et non-redondants
    public List<String> afficherClient() {
        return prestations.stream()
                .map(Prestation::getNomClient)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // Afficher les projets triés et non-redondants
    public List<String> afficherProjects() {
        return prestations.stream()
                .map(Prestation::getNomProjet)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // Récupérer les services et leurs prix totaux
    public Map<Service, Integer> recupererServices() {
        return prestations.stream()
                .filter(p -> p instanceof Service)
                .map(p -> (Service) p)
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.getPrixHeure() * s.getNombreHeures()));
    }

    // Calculer le total des ventes des produits pour l'année 2023
    public void totalVentesProduits() {
        int total = prestations.stream()
                .filter(p -> p instanceof Produit)
                .map(p -> (Produit) p)
                .filter(p -> p.getDateLivraison().contains("2023"))
                .mapToInt(Produit::getPrixTotal)
                .sum();
        System.out.println("Total ventes produits 2023: " + total);
    }

    // Trouver le meilleur client en termes de bénéfices
    public void topServiceClient() {
        Map<String, Integer> clients = new HashMap<>();
        prestations.stream()
                .filter(p -> p instanceof Service)
                .map(p -> (Service) p)
                .forEach(s -> {
                    clients.put(s.getNomClient(),
                            clients.getOrDefault(s.getNomClient(), 0) + s.getPrixHeure() * s.getNombreHeures());
                });

        String bestClient = clients.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Aucun client");

        System.out.println("Meilleur client: " + bestClient);
    }
}
