package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fc")
public class class178 {

    @ObfuscatedName("fc.s")
    public Inflater field2454;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fc.s(Lgy;[BI)V")
    public void method3163(class185 arg0, byte[] arg1) {
        if (arg0.field2512[arg0.field2514] != 31 || arg0.field2512[arg0.field2514 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2454 == null) {
            this.field2454 = new Inflater(true);
        }
        try {
            this.field2454.setInput(arg0.field2512, arg0.field2514 + 10, arg0.field2512.length - (arg0.field2514 + 10 + 8));
            this.field2454.inflate(arg1);
        } catch (Exception var4) {
            this.field2454.reset();
            throw new RuntimeException("");
        }
        this.field2454.reset();
    }
}
