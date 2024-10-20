package deob;

@ObfuscatedName("fe")
public final class class171 {

    @ObfuscatedName("fe.u")
    public class173 field2791 = new class173();

    public class171() {
        this.field2791.field2795 = this.field2791;
        this.field2791.field2794 = this.field2791;
    }

    @ObfuscatedName("fe.u(Lfs;)V")
    public void method3271(class173 arg0) {
        if (arg0.field2794 != null) {
            arg0.method3303();
        }
        arg0.field2794 = this.field2791.field2794;
        arg0.field2795 = this.field2791;
        arg0.field2794.field2795 = arg0;
        arg0.field2795.field2794 = arg0;
    }

    @ObfuscatedName("fe.k(Lfs;)V")
    public void method3272(class173 arg0) {
        if (arg0.field2794 != null) {
            arg0.method3303();
        }
        arg0.field2794 = this.field2791;
        arg0.field2795 = this.field2791.field2795;
        arg0.field2794.field2795 = arg0;
        arg0.field2795.field2794 = arg0;
    }

    @ObfuscatedName("fe.x()Lfs;")
    public class173 method3282() {
        class173 var1 = this.field2791.field2795;
        if (this.field2791 == var1) {
            return null;
        } else {
            var1.method3303();
            return var1;
        }
    }

    @ObfuscatedName("fe.m()Lfs;")
    public class173 method3273() {
        class173 var1 = this.field2791.field2795;
        return this.field2791 == var1 ? null : var1;
    }

    @ObfuscatedName("fe.n()V")
    public void method3274() {
        while (true) {
            class173 var1 = this.field2791.field2795;
            if (this.field2791 == var1) {
                return;
            }
            var1.method3303();
        }
    }
}
