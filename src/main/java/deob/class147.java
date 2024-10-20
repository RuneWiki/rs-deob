package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ej")
public class class147 {

    @ObfuscatedName("ej.s")
    public Inflater field2029;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ej.s(Lea;[BI)V")
    public void method2479(class154 arg0, byte[] arg1) {
        if (arg0.field2100[arg0.field2098] != 31 || arg0.field2100[arg0.field2098 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2029 == null) {
            this.field2029 = new Inflater(true);
        }
        try {
            this.field2029.setInput(arg0.field2100, arg0.field2098 + 10, arg0.field2100.length - (arg0.field2098 + 10 + 8));
            this.field2029.inflate(arg1);
        } catch (Exception var4) {
            this.field2029.reset();
            throw new RuntimeException("");
        }
        this.field2029.reset();
    }
}
