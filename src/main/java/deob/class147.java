package deob;

import java.util.zip.Inflater;

@ObfuscatedName("et")
public class class147 {

    @ObfuscatedName("et.x")
    public Inflater field2022;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("et.x(Lek;[BI)V")
    public void method2575(class154 arg0, byte[] arg1) {
        if (arg0.field2091[arg0.field2086] != 31 || arg0.field2091[arg0.field2086 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2022 == null) {
            this.field2022 = new Inflater(true);
        }
        try {
            this.field2022.setInput(arg0.field2091, arg0.field2086 + 10, arg0.field2091.length - (arg0.field2086 + 10 + 8));
            this.field2022.inflate(arg1);
        } catch (Exception var4) {
            this.field2022.reset();
            throw new RuntimeException("");
        }
        this.field2022.reset();
    }
}
