import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Créer une instance d'Entreprise
        Entreprise entreprise = new Entreprise();

        try {
            // Ajouter quelques prestations
            Produit produit1 = new Produit(1, "Site Web", "Client A", 5000, "2023-03-15");
            Produit produit2 = new Produit(2, "Application Mobile", "Client B", 10000, "2023-08-20");
            Produit produit3 = new Produit(3, "E-commerce", "Client A", 7500, "2022-12-10");

            Service service1 = new Service(4, "Maintenance", "Client C", 50, 100);
            Service service2 = new Service(5, "Consultation", "Client B", 20, 200);
            Service service3 = new Service(6, "Support", "Client A", 40, 150);

            entreprise.ajouterPrestation(produit1);
            entreprise.ajouterPrestation(produit2);
            entreprise.ajouterPrestation(produit3);
            entreprise.ajouterPrestation(service1);
            entreprise.ajouterPrestation(service2);
            entreprise.ajouterPrestation(service3);

            // Afficher le nombre de prestations par type
            System.out.println("=== Nombre de prestations par type ===");
            entreprise.afficherNbrPrestation();

            // Afficher les prestations d'un client spécifique
            System.out.println("\n=== Prestations pour Client A ===");
            List<Prestation> prestationsClientA = entreprise.prestationparClient("Client A");
            prestationsClientA.forEach(System.out::println);

            // Filtrer les prestations par client
            System.out.println("\n=== Prestations groupées par client ===");
            Map<String, List<Prestation>> prestationsParClient = entreprise.filterParClient();
            prestationsParClient.forEach((client, prestations) -> {
                System.out.println(client + ": " + prestations);
            });

            // Afficher les clients uniques triés
            System.out.println("\n=== Liste des clients ===");
            List<String> clients = entreprise.afficherClient();
            clients.forEach(System.out::println);

            // Afficher les projets uniques triés
            System.out.println("\n=== Liste des projets ===");
            List<String> projets = entreprise.afficherProjects();
            projets.forEach(System.out::println);

            // Récupérer les services et leurs prix totaux
            System.out.println("\n=== Services et leurs prix totaux ===");
            Map<Service, Integer> services = entreprise.recupererServices();
            services.forEach((service, total) -> {
                System.out.println(service + " -> Total: " + total);
            });

            // Calculer le total des ventes des produits de 2023
            System.out.println("\n=== Total des ventes des produits de 2023 ===");
            entreprise.totalVentesProduits();

            // Trouver le meilleur client en termes de bénéfices
            System.out.println("\n=== Meilleur client ===");
            entreprise.topServiceClient();

        } catch (PrestationExisteException e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
