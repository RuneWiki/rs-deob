package deob;

@ObfuscatedName("gr")
public final class class193 {

    @ObfuscatedName("gr.f")
    public class204 field3070 = new class204();

    @ObfuscatedName("gr.s")
    public int field3073;

    @ObfuscatedName("gr.q")
    public int field3071;

    @ObfuscatedName("gr.g")
    public class196 field3069;

    @ObfuscatedName("gr.m")
    public class203 field3072 = new class203();

    public class193(int arg0) {
        this.field3073 = arg0;
        this.field3071 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3069 = new class196(var2);
    }

    @ObfuscatedName("gr.f(J)Lgj;")
    public class204 method3497(long arg0) {
        class204 var3 = (class204) this.field3069.method3532(arg0);
        if (var3 != null) {
            this.field3072.method3621(var3);
        }
        return var3;
    }

    @ObfuscatedName("gr.s(J)V")
    public void method3498(long arg0) {
        class204 var3 = (class204) this.field3069.method3532(arg0);
        if (var3 != null) {
            var3.method3665();
            var3.method3636();
            this.field3071++;
        }
    }

    @ObfuscatedName("gr.q(Lgj;J)V")
    public void method3508(class204 arg0, long arg1) {
        if (this.field3071 == 0) {
            class204 var4 = this.field3072.method3623();
            var4.method3665();
            var4.method3636();
            if (this.field3070 == var4) {
                class204 var5 = this.field3072.method3623();
                var5.method3665();
                var5.method3636();
            }
        } else {
            this.field3071--;
        }
        this.field3069.method3534(arg0, arg1);
        this.field3072.method3621(arg0);
    }

    @ObfuscatedName("gr.g()V")
    public void method3499() {
        this.field3072.method3625();
        this.field3069.method3535();
        this.field3070 = new class204();
        this.field3071 = this.field3073;
    }
}
