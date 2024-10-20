package deob;

@ObfuscatedName("og")
public class class396 {

    @ObfuscatedName("og.r")
    public String field4346;

    @ObfuscatedName("og.o")
    public class307 field4347;

    @ObfuscatedName("og.i")
    public int field4348 = 0;

    @ObfuscatedName("og.w")
    public boolean field4342 = false;

    public class396(class307 arg0) {
        this.field4347 = arg0;
    }

    @ObfuscatedName("og.c(Ljava/lang/String;I)V")
    public void method6196(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4346 != arg0) {
            this.field4346 = arg0;
            this.field4348 = 0;
            this.field4342 = false;
            this.method6200();
        }
    }

    @ObfuscatedName("og.l(I)I")
    public int method6200() {
        if (this.field4348 < 33) {
            if (!this.field4347.method5050(class237.field2791.field2795, this.field4346)) {
                return this.field4348;
            }
            this.field4348 = 33;
        }
        if (this.field4348 == 33) {
            if (this.field4347.method5044(class237.field2792.field2795, this.field4346) && !this.field4347.method5050(class237.field2792.field2795, this.field4346)) {
                return this.field4348;
            }
            this.field4348 = 66;
        }
        if (this.field4348 == 66) {
            if (!this.field4347.method5050(this.field4346, class237.field2796.field2795)) {
                return this.field4348;
            }
            this.field4348 = 100;
            this.field4342 = true;
        }
        return this.field4348;
    }

    @ObfuscatedName("og.s(I)Z")
    public boolean method6198() {
        return this.field4342;
    }

    @ObfuscatedName("og.e(I)I")
    public int method6199() {
        return this.field4348;
    }
}
