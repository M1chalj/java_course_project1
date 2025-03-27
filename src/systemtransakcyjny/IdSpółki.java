package systemtransakcyjny;

import java.security.InvalidParameterException;

public class IdSpółki {
    private final String id;

    public IdSpółki(String s) {
        if (s.length() > 5 || s.isEmpty()) {
            throw new InvalidParameterException("Niepoprawne id spółki");
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z') {
                throw new InvalidParameterException("Niepoprawne id spółki");
            }
        }
        id = s;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdSpółki)) {
            return false;
        }
        IdSpółki idSpółki = (IdSpółki) obj;
        return id.equals(idSpółki.id);
    }

    @Override   
    public int hashCode() {
        return id.hashCode();
    }
}
