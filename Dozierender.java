public class Dozierender {
    // Datenfelder (Veri Alanları) [cite: 53]
    private String name;        // Doçentin adı [cite: 53]
    private String fakultaet;   // Ait olduğu fakülte [cite: 53]
    private String bueronummer; // Büro numarası [cite: 53]

    // Konstruktor (Nesne oluşturmak için gerekli kurucu metot)
    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    // Aufgabe 2: Öffentliche Methode (Soru yanıtlama metodu) [cite: 54]
    // Bu metot bir Studierender nesnesinden gelen soruyu yanıtlar [cite: 54, 56]
    public void frageBeantworten(Studierender studierender, String antwort) {
        System.out.println("Dozent " + this.name + " antwortet an " + studierender.getName() + ": " + antwort);
    }

    // Aufgabe 3: Feedback-Management (Geri bildirim alma metodu) [cite: 68]
    public void feedbackErhalten(Studierender studierender, String feedbackText) {
        System.out.println("Feedback von " + studierender.getName() + " erhalten: " + feedbackText);
    }

    // Arkadaşının senin ismini kullanabilmesi için gerekli yardımcı metot
    public String getName() {
        return name;
    }
}