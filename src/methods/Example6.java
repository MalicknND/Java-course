package methods;

// Exemple de passage de paramètre par valeur (pass-by-value)

public class Example6 {
    public static void main(String[] args) {
        // Déclaration et initialisation de la variable x
        int x = 10;
        System.out.println("Before calling the method, x = " + x); // Affiche la valeur initiale de x

        // Appel de la méthode en passant x comme argument
        changeValue(x);

        // Affiche la valeur de x après l'appel de la méthode (x reste inchangé)
        System.out.println("After calling the method, x = " + x);
    }

    // Méthode qui tente de modifier la valeur passée en paramètre
    public static void changeValue(int num) {
        // Incrémente num de 10 (cela ne modifie pas x, car num est une copie de x)
        num += 10;
        System.out.println("Inside the method, num = " + num); // Affiche la nouvelle valeur de num
    }
}
