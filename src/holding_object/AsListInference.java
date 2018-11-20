package holding_object;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {

}

class Powder extends Snow {

}

class Light extends Powder {

}

class Heavy extends Powder {

}

class Crusty extends Snow {

}

class Slush extends Snow {

}


public class AsListInference {

    public static void main(String[] args) {

        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

        List<Snow> snow2 = Arrays.asList(new Heavy(), new Light());

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy(), new Heavy());

        System.out.println(snow1);

        for (Snow snow : snow1) {
            System.out.println(snow);
        }

        for (Snow snow : snow2) {
            System.out.println(snow);
        }

        for (Snow snow : snow3) {
            System.out.println(snow);
        }


    }


}
