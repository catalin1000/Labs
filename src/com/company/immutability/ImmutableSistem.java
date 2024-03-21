package com.company.immutability;

public class ImmutableSistem {
    private final String nume;
    private final String versiune;

    public ImmutableSistem(String nume, String versiune) {
        this.nume = nume;
        this.versiune = versiune;
    }

    public String getNume() {
        return nume;
    }

    public String getVersiune() {
        return versiune;
    }

    @Override
    public String toString() {
        return "SistemOperare{" +
                "nume='" + nume + '\'' +
                ", versiune='" + versiune + '\'' +
                '}';
    }
}
