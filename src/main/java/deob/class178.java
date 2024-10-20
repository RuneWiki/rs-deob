package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fg")
public class class178 {

    @ObfuscatedName("fg.v")
    public Inflater field2321;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fg.v(Lgx;[BB)V")
    public void method3201(class185 arg0, byte[] arg1) {
        if (arg0.field2387[arg0.field2386] != 31 || arg0.field2387[arg0.field2386 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2321 == null) {
            this.field2321 = new Inflater(true);
        }
        try {
            this.field2321.setInput(arg0.field2387, arg0.field2386 + 10, arg0.field2387.length - (arg0.field2386 + 10 + 8));
            this.field2321.inflate(arg1);
        } catch (Exception var4) {
            this.field2321.reset();
            throw new RuntimeException("");
        }
        this.field2321.reset();
    }
}
