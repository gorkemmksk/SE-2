class Studierender {
    String name;
    int matrikelnummer;
    String studiengang;

    public void frageStellen(Dozierender dozent, String frage){
        System.out.println(this.name + " fragt " + dozent.name + ": " + frage);
    }

    public void sprechstundeVereinbaren(Dozierender dozent, String datum){
        System.out.println(this.name + " möchte eine Sprechstunde bei " + dozent.name + " am " + datum + " vereinbaren.");
    }
}