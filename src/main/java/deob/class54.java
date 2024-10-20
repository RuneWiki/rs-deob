package deob;

@ObfuscatedName("bg")
public class class54 {

    @ObfuscatedName("bg.c")
    public final class252 field523;

    @ObfuscatedName("bg.q")
    public final int field520;

    @ObfuscatedName("bg.m")
    public int field521 = 0;

    public class54(class252 arg0, String arg1) {
        this.field523 = arg0;
        this.field520 = arg0.method4223();
    }

    @ObfuscatedName("bg.c(I)Z")
    public boolean method956() {
        this.field521 = 0;
        for (int var1 = 0; var1 < this.field520; var1++) {
            if (!this.field523.method4327(var1) || this.field523.method4333(var1)) {
                this.field521++;
            }
        }
        return this.field521 >= this.field520;
    }
}
