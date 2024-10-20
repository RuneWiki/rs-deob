package deob;

import java.util.zip.Inflater;

@ObfuscatedName("em")
public class class147 {

    @ObfuscatedName("em.q")
    public Inflater field2020;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("em.q(Lel;[BI)V")
    public void method2596(class154 arg0, byte[] arg1) {
        if (arg0.field2092[arg0.field2091] != 31 || arg0.field2092[arg0.field2091 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2020 == null) {
            this.field2020 = new Inflater(true);
        }
        try {
            this.field2020.setInput(arg0.field2092, arg0.field2091 + 10, arg0.field2092.length - (arg0.field2091 + 10 + 8));
            this.field2020.inflate(arg1);
        } catch (Exception var4) {
            this.field2020.reset();
            throw new RuntimeException("");
        }
        this.field2020.reset();
    }
}
