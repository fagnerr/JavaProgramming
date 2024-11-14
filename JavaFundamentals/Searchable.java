package javafundamentals;

import java.time.LocalDateTime;

public interface Searchable {
    boolean search(LocalDateTime dateStartTime, LocalDateTime dateEndTime);
}
