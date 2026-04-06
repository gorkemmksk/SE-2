public class Dozierender {
    // Datenfelder [cite: 53]
    private String name;        // [cite: 53]
    private String fakultaet;   // [cite: 53]
    private String bueronummer; // [cite: 53]

    // Konstruktor 
    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    // Aufgabe 2: Öffentliche Methode [cite: 54]
    // [cite: 54, 56]
    public void frageBeantworten(Studierender studierender, String antwort) {
        System.out.println("Dozent " + this.name + " antwortet an " + studierender.getName() + ": " + antwort);
    }

    // Aufgabe 3: Feedback-Management [cite: 55]
    public void feedbackErhalten(Studierender studierender, String feedbackText) {
        System.out.println("Feedback von " + studierender.getName() + " erhalten: " + feedbackText);
    }

    // Getter für den Namen, damit Studierende den Namen des Dozenten abrufen können
    public String getName() {
        return name;
    }
}