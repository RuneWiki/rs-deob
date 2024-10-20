package deob;

import java.util.zip.Inflater;

@ObfuscatedName("mw")
public class class344 {

    @ObfuscatedName("mw.x")
    public Inflater field4032;

    public class344() {
        this(-1, 1000000, 1000000);
    }

    public class344(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mw.x(Lkb;[BI)V")
    public void method6131(class310 arg0, byte[] arg1) {
        if (arg0.field3710[arg0.field3711] != 31 || arg0.field3710[arg0.field3711 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4032 == null) {
            this.field4032 = new Inflater(true);
        }
        try {
            this.field4032.setInput(arg0.field3710, arg0.field3711 + 10, arg0.field3710.length - (arg0.field3711 + 10 + 8));
            this.field4032.inflate(arg1);
        } catch (Exception var4) {
            this.field4032.reset();
            throw new RuntimeException("");
        }
        this.field4032.reset();
    }
}
