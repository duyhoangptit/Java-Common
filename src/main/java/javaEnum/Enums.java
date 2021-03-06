package javaEnum;

/**
 * Created by Hoang Ta Duy on 9/28/2017.
 */
public final class Enums {

    public enum FileType {
        PNG(".png"),
        JPG(".jpg"),
        JPEG(".jpeg"),
        GIF(".gif"),
        PDF(".pdf"),
        CSV(".csv"),
        DOCX(".docx"),
        XLSX(".xlsx"),
        DXF(".dxf");

        private String extension;

        FileType(final String fileExtension) {
            this.extension = fileExtension;
        }

        public String getType() {
            return extension;
        }

        public String toString() {
            return extension;
        }
    }

    public enum Role {
        ADMIN(1),
        USER(2),
        STAFF(3);

        private Integer role;

        Role(final Integer role) {
            this.role = role;
        }

        public Integer getRole() {
            return this.role;
        }
    }

    public enum FileTypeReport {
        JAPER(1),
        JRXML(2);

        private Integer extension;

        FileTypeReport(final Integer fileExtension) {
            this.extension = fileExtension;
        }

        public Integer getType() {
            return extension;
        }
    }
}
