package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ed")
public class class147 {

    @ObfuscatedName("ed.p")
    public Inflater field2024;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ed.p(Lev;[BI)V")
    public void method2528(class154 arg0, byte[] arg1) {
        if (arg0.field2092[arg0.field2098] != 31 || arg0.field2092[arg0.field2098 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2024 == null) {
            this.field2024 = new Inflater(true);
        }
        try {
            this.field2024.setInput(arg0.field2092, arg0.field2098 + 10, arg0.field2092.length - (arg0.field2098 + 10 + 8));
            this.field2024.inflate(arg1);
        } catch (Exception var4) {
            this.field2024.reset();
            throw new RuntimeException("");
        }
        this.field2024.reset();
    }
}
