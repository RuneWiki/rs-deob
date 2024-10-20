package deob;

import java.util.zip.Inflater;

@ObfuscatedName("vu")
public class class566 {

    @ObfuscatedName("vu.ak")
    public Inflater field5488;

    public class566() {
        this(-1, 1000000, 1000000);
    }

    public class566(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("vu.ak(Lua;[BB)V")
    public void method9378(class546 arg0, byte[] arg1) {
        if (arg0.field5346[arg0.field5344] != 31 || arg0.field5346[arg0.field5344 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5488 == null) {
            this.field5488 = new Inflater(true);
        }
        try {
            this.field5488.setInput(arg0.field5346, arg0.field5344 + 10, arg0.field5346.length - (arg0.field5344 + 10 + 8));
            this.field5488.inflate(arg1);
        } catch (Exception var4) {
            this.field5488.reset();
            throw new RuntimeException("");
        }
        this.field5488.reset();
    }
}
