package cl.eme.listexample;

import java.util.ArrayList;
import java.util.List;

class DessertFit {

    private int id;
    private String nombre;
    private String descripcion;
    private String ingredientes;
    private String preparacion;
    private int imagen;

    public DessertFit(int id, String nombre, String descripcion, String ingredientes, String preparacion, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "DessertFit{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", preparacion='" + preparacion + '\'' +
                ", imagen=" + imagen +
                '}';
    }

    public static List<DessertFit> getDesserts() {
        List<DessertFit> listado = new ArrayList<>();

        listado.add(new DessertFit(0, "Brownies bites de banana", "Deliciosos y saludables brownies libres de azucar",
                "Ingredientes:\n" +
                        "\n" +
                        "- 1 scoop de proteína de vainilla o chocolate\n"
                        +
                        "\n" +
                        "- 2 cucharadas de harina de coco\n" +
                        "\n" +
                        "- 2 cucharadas de cacao en polvo sin azúcar\n" +
                        "\n" +
                        "- 1 cucharadita de polvo de hornear\n" +
                        "\n" +
                        "- 1/8 de cucharadita de bicarbonato de sodio\n" +
                        "\n" +
                        "- 1 pizca de sal\n" +
                        "\n" +
                        "- 3 cucharadas de extracto de stevia natural (o el edulcorante que utilicen, aconsejo ir probando hasta alcanzar el punto deseado de dulzura)\n" +
                        "\n" +
                        "- 3 claras\n" +
                        "\n" +
                        "- 1 chorrito de vinagre\n" +
                        "\n" +
                        "- 1 cucharada de miel o jarabe sin azúcar\n" +
                        "\n" +
                        "- 1 banano (cambur) maduro\n" +
                        "\n" +
                        "- 1 cucharadita de esencia de vainilla\n" +
                        "\n",
                "Preparación:\n" +
                        "\n" +
                        "1. Integra todos los ingredientes secos, reserva.\n" +
                        "\n" +
                        "2. Bate las claras con el chorrito de vinagre hasta conseguir el punto de nieve.\n" +
                        "\n" +
                        "3. Mezcla el resto de ingredientes húmedos (banano, miel o jarabe y vainilla) y anadelos a la mezcla seca, luego integra las claras montadas con movimientos envolventes. Revuelve o bate hasta que la mezcla esté homogénea.\n" +
                        "\n" +
                        "4. Vierte la preparación en moldes engrasados, llenando 3/4 partes de cada uno. Puedes decorar opcionalmente con chips de chocolate sin azúcar o trocitos de cacao.\n" +
                        "\n" +
                        "5. Hornea por 10-15 minutos a 180°C/350°F. Desmolda y disfruta.", R.drawable.brownies_bites_de_banana));

        listado.add(new DessertFit(1,
                "Queque de humus",
                "Queque de garbanzos orientales sin azucar",
                "garbanzos",
                "dificil",
                R.drawable.brownies_bites_de_banana));

        listado.add(new DessertFit(2,
                "Helado de yogurt",
                "fresco y natural",
                "yogurt y hielo",
                "mezclar el yogurt y el hielo",
                R.drawable.brownies_bites_de_banana));


        listado.add(new DessertFit(3,
                "Helado de yogurt con torta",
                "fresco y natural torta",
                "yogurt y hielo",
                "mezclar el yogurt y el hielo",
                R.drawable.brownies_bites_de_banana));

        listado.add(new DessertFit(4,
                "hielo con sabor",
                "fresco y natural torta",
                "yogurt y hielo",
                "mezclar el yogurt y el hielo",
                R.drawable.brownies_bites_de_banana));

        listado.add(new DessertFit(5,
                "queque vegano",
                "fresco y natural torta",
                "yogurt y hielo",
                "mezclar el yogurt y el hielo",
                R.drawable.brownies_bites_de_banana));

        return listado;
    }
}
