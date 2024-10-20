package deob;

@ObfuscatedName("pc")
public class class437 {

    @ObfuscatedName("pc.m")
    public String field4733;

    @ObfuscatedName("pc.q")
    public class333 field4730;

    @ObfuscatedName("pc.f")
    public int field4735 = 0;

    @ObfuscatedName("pc.r")
    public boolean field4728 = false;

    public class437(class333 arg0) {
        this.field4730 = arg0;
    }

    @ObfuscatedName("pc.h(Ljava/lang/String;B)V")
    public void method7255(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4733 != arg0) {
            this.field4733 = arg0;
            this.field4735 = 0;
            this.field4728 = false;
            this.method7260();
        }
    }

    @ObfuscatedName("pc.e(I)I")
    public int method7260() {
        if (this.field4735 < 33) {
            if (!this.field4730.method5865(class257.field3006.field3009, this.field4733)) {
                return this.field4735;
            }
            this.field4735 = 33;
        }
        if (this.field4735 == 33) {
            if (this.field4730.method5894(class257.field3010.field3009, this.field4733) && !this.field4730.method5865(class257.field3010.field3009, this.field4733)) {
                return this.field4735;
            }
            this.field4735 = 66;
        }
        if (this.field4735 == 66) {
            if (!this.field4730.method5865(this.field4733, class257.field3005.field3009)) {
                return this.field4735;
            }
            this.field4735 = 100;
            this.field4728 = true;
        }
        return this.field4735;
    }

    @ObfuscatedName("pc.v(I)Z")
    public boolean method7257() {
        return this.field4728;
    }

    @ObfuscatedName("pc.x(I)I")
    public int method7254() {
        return this.field4735;
    }
}
