package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("jb")
public abstract class class277 {

    @ObfuscatedName("jb.u")
    public final int field3591;

    @ObfuscatedName("jb.r")
    public int field3589 = 0;

    @ObfuscatedName("jb.p")
    public class274[] field3593;

    @ObfuscatedName("jb.q")
    public HashMap field3590;

    @ObfuscatedName("jb.m")
    public HashMap field3592;

    @ObfuscatedName("jb.y")
    public Comparator field3588 = null;

    public class277(int arg0) {
        this.field3591 = arg0;
        this.field3593 = this.method4598(arg0);
        this.field3590 = new HashMap(arg0 / 8);
        this.field3592 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jb.c(I)V")
    public void method4609() {
        this.field3589 = 0;
        Arrays.fill(this.field3593, (Object) null);
        this.field3590.clear();
        this.field3592.clear();
    }

    @ObfuscatedName("jb.b(I)I")
    public int method4637() {
        return this.field3589;
    }

    @ObfuscatedName("jb.o(I)Z")
    public boolean method4659() {
        return this.field3591 == this.field3589;
    }

    @ObfuscatedName("jb.a(Ljq;I)Z")
    public boolean method4612(class283 arg0) {
        if (arg0.method4699()) {
            return this.field3590.containsKey(arg0) ? true : this.field3592.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jb.e(Ljq;I)Ljh;")
    public class274 method4613(class283 arg0) {
        class274 var2 = this.method4652(arg0);
        return var2 == null ? this.method4615(arg0) : var2;
    }

    @ObfuscatedName("jb.x(Ljq;B)Ljh;")
    public class274 method4652(class283 arg0) {
        return arg0.method4699() ? (class274) this.field3590.get(arg0) : null;
    }

    @ObfuscatedName("jb.h(Ljq;I)Ljh;")
    public class274 method4615(class283 arg0) {
        return arg0.method4699() ? (class274) this.field3592.get(arg0) : null;
    }

    @ObfuscatedName("jb.s(Ljq;I)Z")
    public final boolean method4639(class283 arg0) {
        class274 var2 = this.method4652(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4678(var2);
            return true;
        }
    }

    @ObfuscatedName("jb.f(Ljh;I)V")
    public final void method4678(class274 arg0) {
        int var2 = this.method4628(arg0);
        if (var2 != -1) {
            this.method4627(var2);
            this.method4624(arg0);
        }
    }

    @ObfuscatedName("jb.j(Ljq;I)Ljh;")
    public class274 method4669(class283 arg0) {
        return this.method4619(arg0, (class283) null);
    }

    @ObfuscatedName("jb.d(Ljq;Ljq;S)Ljh;")
    public class274 method4619(class283 arg0, class283 arg1) {
        if (this.method4652(arg0) != null) {
            throw new IllegalStateException();
        }
        class274 var3 = this.method4599();
        var3.method4573(arg0, arg1);
        this.method4618(var3);
        this.method4625(var3);
        return var3;
    }

    @ObfuscatedName("jb.l(II)Ljh;")
    public final class274 method4620(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3589) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3593[arg0];
    }

    @ObfuscatedName("jb.k(I)V")
    public final void method4608() {
        if (this.field3588 == null) {
            Arrays.sort(this.field3593, 0, this.field3589);
        } else {
            Arrays.sort(this.field3593, 0, this.field3589, this.field3588);
        }
    }

    @ObfuscatedName("jb.ac(Ljh;Ljq;Ljq;B)V")
    public final void method4622(class274 arg0, class283 arg1, class283 arg2) {
        this.method4624(arg0);
        arg0.method4573(arg1, arg2);
        this.method4625(arg0);
    }

    @ObfuscatedName("jb.aa(Ljh;B)I")
    public final int method4628(class274 arg0) {
        for (int var2 = 0; var2 < this.field3589; var2++) {
            if (this.field3593[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jb.ap(Ljh;I)V")
    public final void method4624(class274 arg0) {
        if (this.field3590.remove(arg0.field3579) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3577 != null) {
            this.field3592.remove(arg0.field3577);
        }
    }

    @ObfuscatedName("jb.ar(Ljh;B)V")
    public final void method4618(class274 arg0) {
        this.field3593[++this.field3589 - 1] = arg0;
    }

    @ObfuscatedName("jb.ab(Ljh;I)V")
    public final void method4625(class274 arg0) {
        this.field3590.put(arg0.field3579, arg0);
        if (arg0.field3577 != null) {
            class274 var2 = (class274) this.field3592.put(arg0.field3577, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3577 = null;
            }
        }
    }

    @ObfuscatedName("jb.ax(IB)V")
    public final void method4627(int arg0) {
        this.field3589--;
        if (arg0 < this.field3589) {
            System.arraycopy(this.field3593, arg0 + 1, this.field3593, arg0, this.field3589 - arg0);
        }
    }

    @ObfuscatedName("jb.as(B)V")
    public final void method4629() {
        this.field3588 = null;
    }

    @ObfuscatedName("jb.ao(Ljava/util/Comparator;B)V")
    public final void method4630(Comparator arg0) {
        if (this.field3588 == null) {
            this.field3588 = arg0;
        } else if (this.field3588 instanceof class275) {
            ((class275) this.field3588).method4588(arg0);
        }
    }

    @ObfuscatedName("jb.z(B)Ljh;")
    public abstract class274 method4599();

    @ObfuscatedName("jb.n(II)[Ljh;")
    public abstract class274[] method4598(int arg0);
}
