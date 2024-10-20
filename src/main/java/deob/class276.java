package deob;

import java.util.Arrays;
import java.util.HashMap;

@ObfuscatedName("ja")
public abstract class class276 {

    @ObfuscatedName("ja.s")
    public final int field3686;

    @ObfuscatedName("ja.j")
    public int field3685 = 0;

    @ObfuscatedName("ja.a")
    public class274[] field3688;

    @ObfuscatedName("ja.t")
    public HashMap field3687;

    @ObfuscatedName("ja.r")
    public HashMap field3684;

    public class276(int arg0) {
        this.field3686 = arg0;
        this.field3688 = this.method4668(arg0);
        this.field3687 = new HashMap(arg0 / 8);
        this.field3684 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ja.l(B)V")
    public void method4707() {
        this.field3685 = 0;
        Arrays.fill(this.field3688, (Object) null);
        this.field3687.clear();
        this.field3684.clear();
    }

    @ObfuscatedName("ja.f(B)I")
    public int method4682() {
        return this.field3685;
    }

    @ObfuscatedName("ja.k(I)Z")
    public boolean method4683() {
        return this.field3686 == this.field3685;
    }

    @ObfuscatedName("ja.e(Ljr;I)Z")
    public boolean method4684(class281 arg0) {
        if (arg0.method4753()) {
            return this.field3687.containsKey(arg0) ? true : this.field3684.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ja.u(Ljr;B)Lju;")
    public class274 method4685(class281 arg0) {
        class274 var2 = this.method4686(arg0);
        return var2 == null ? this.method4687(arg0) : var2;
    }

    @ObfuscatedName("ja.z(Ljr;I)Lju;")
    public class274 method4686(class281 arg0) {
        return arg0.method4753() ? (class274) this.field3687.get(arg0) : null;
    }

    @ObfuscatedName("ja.b(Ljr;I)Lju;")
    public class274 method4687(class281 arg0) {
        return arg0.method4753() ? (class274) this.field3684.get(arg0) : null;
    }

    @ObfuscatedName("ja.c(Ljr;B)Z")
    public final boolean method4700(class281 arg0) {
        class274 var2 = this.method4686(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4689(var2);
            return true;
        }
    }

    @ObfuscatedName("ja.aa(Lju;I)V")
    public final void method4689(class274 arg0) {
        int var2 = this.method4695(arg0);
        if (var2 != -1) {
            this.method4701(var2);
            this.method4696(arg0);
        }
    }

    @ObfuscatedName("ja.ap(Ljr;B)Lju;")
    public class274 method4681(class281 arg0) {
        return this.method4691(arg0, (class281) null);
    }

    @ObfuscatedName("ja.ao(Ljr;Ljr;I)Lju;")
    public class274 method4691(class281 arg0, class281 arg1) {
        if (this.method4685(arg0) != null) {
            throw new IllegalStateException();
        }
        class274 var3 = this.method4667();
        var3.method4664(arg0, arg1);
        this.method4720(var3);
        this.method4698(var3);
        return var3;
    }

    @ObfuscatedName("ja.ar(IB)Lju;")
    public final class274 method4699(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3685) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.field3688[arg0];
    }

    @ObfuscatedName("ja.ay(I)V")
    public final void method4693() {
        Arrays.sort(this.field3688, 0, this.field3685);
    }

    @ObfuscatedName("ja.ax(Lju;Ljr;Ljr;S)V")
    public final void method4688(class274 arg0, class281 arg1, class281 arg2) {
        this.method4696(arg0);
        arg0.method4664(arg1, arg2);
        this.method4698(arg0);
    }

    @ObfuscatedName("ja.ae(Lju;I)I")
    public final int method4695(class274 arg0) {
        for (int var2 = 0; var2 < this.field3685; var2++) {
            if (this.field3688[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ja.ah(Lju;I)V")
    public final void method4696(class274 arg0) {
        if (this.field3687.remove(arg0.field3679) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3678 != null) {
            this.field3684.remove(arg0.field3678);
        }
    }

    @ObfuscatedName("ja.ai(Lju;I)V")
    public final void method4720(class274 arg0) {
        this.field3688[++this.field3685 - 1] = arg0;
    }

    @ObfuscatedName("ja.au(Lju;S)V")
    public final void method4698(class274 arg0) {
        this.field3687.put(arg0.field3679, arg0);
        if (arg0.field3678 != null) {
            this.field3684.put(arg0.field3678, arg0);
        }
    }

    @ObfuscatedName("ja.am(II)V")
    public final void method4701(int arg0) {
        this.field3685--;
        if (arg0 < this.field3685) {
            System.arraycopy(this.field3688, arg0 + 1, this.field3688, arg0, this.field3685 - arg0);
        }
    }

    @ObfuscatedName("ja.p(B)Lju;")
    public abstract class274 method4667();

    @ObfuscatedName("ja.i(II)[Lju;")
    public abstract class274[] method4668(int arg0);
}
