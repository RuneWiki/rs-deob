package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fu")
public class class170 {

    @ObfuscatedName("fu.w")
    public Inflater field2349;

    public class170() {
        this(-1, 1000000, 1000000);
    }

    public class170(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fu.w(Lfi;[BB)V")
    public void method2825(class177 arg0, byte[] arg1) {
        if (arg0.field2419[arg0.field2412] != 31 || arg0.field2419[arg0.field2412 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2349 == null) {
            this.field2349 = new Inflater(true);
        }
        try {
            this.field2349.setInput(arg0.field2419, arg0.field2412 + 10, arg0.field2419.length - (arg0.field2412 + 10 + 8));
            this.field2349.inflate(arg1);
        } catch (Exception var4) {
            this.field2349.reset();
            throw new RuntimeException("");
        }
        this.field2349.reset();
    }
}
