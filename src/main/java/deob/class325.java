package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ld")
public abstract class class325 {

    @ObfuscatedName("ld.h")
    public final int field3841;

    @ObfuscatedName("ld.d")
    public int field3844 = 0;

    @ObfuscatedName("ld.z")
    public class323[] field3840;

    @ObfuscatedName("ld.b")
    public HashMap field3842;

    @ObfuscatedName("ld.i")
    public HashMap field3839;

    @ObfuscatedName("ld.k")
    public Comparator field3843 = null;

    public class325(int arg0) {
        this.field3841 = arg0;
        this.field3840 = this.method5108(arg0);
        this.field3842 = new HashMap(arg0 / 8);
        this.field3839 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ld.ag(I)V")
    public void method5198() {
        this.field3844 = 0;
        Arrays.fill(this.field3840, (Object) null);
        this.field3842.clear();
        this.field3839.clear();
    }

    @ObfuscatedName("ld.ab(I)I")
    public int method5199() {
        return this.field3844;
    }

    @ObfuscatedName("ld.aq(I)Z")
    public boolean method5200() {
        return this.field3844 == this.field3841;
    }

    @ObfuscatedName("ld.ae(Llc;I)Z")
    public boolean method5252(class329 arg0) {
        if (arg0.method5265()) {
            return this.field3842.containsKey(arg0) ? true : this.field3839.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ld.ao(Llc;I)Llf;")
    public class323 method5247(class329 arg0) {
        class323 var2 = this.method5202(arg0);
        return var2 == null ? this.method5203(arg0) : var2;
    }

    @ObfuscatedName("ld.an(Llc;B)Llf;")
    public class323 method5202(class329 arg0) {
        return arg0.method5265() ? (class323) this.field3842.get(arg0) : null;
    }

    @ObfuscatedName("ld.al(Llc;I)Llf;")
    public class323 method5203(class329 arg0) {
        return arg0.method5265() ? (class323) this.field3839.get(arg0) : null;
    }

    @ObfuscatedName("ld.aj(Llc;B)Z")
    public final boolean method5204(class329 arg0) {
        class323 var2 = this.method5202(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5205(var2);
            return true;
        }
    }

    @ObfuscatedName("ld.ac(Llf;I)V")
    public final void method5205(class323 arg0) {
        int var2 = this.method5210(arg0);
        if (var2 != -1) {
            this.method5214(var2);
            this.method5211(arg0);
        }
    }

    @ObfuscatedName("ld.as(Llc;I)Llf;")
    public class323 method5227(class329 arg0) {
        return this.method5239(arg0, (class329) null);
    }

    @ObfuscatedName("ld.au(Llc;Llc;I)Llf;")
    public class323 method5239(class329 arg0, class329 arg1) {
        if (this.method5202(arg0) != null) {
            throw new IllegalStateException();
        }
        class323 var3 = this.method5102();
        var3.method5180(arg0, arg1);
        this.method5212(var3);
        this.method5213(var3);
        return var3;
    }

    @ObfuscatedName("ld.ay(IB)Llf;")
    public final class323 method5208(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3844) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3840[arg0];
    }

    @ObfuscatedName("ld.am(B)V")
    public final void method5229() {
        if (this.field3843 == null) {
            Arrays.sort(this.field3840, 0, this.field3844);
        } else {
            Arrays.sort(this.field3840, 0, this.field3844, this.field3843);
        }
    }

    @ObfuscatedName("ld.aa(Llf;Llc;Llc;I)V")
    public final void method5209(class323 arg0, class329 arg1, class329 arg2) {
        this.method5211(arg0);
        arg0.method5180(arg1, arg2);
        this.method5213(arg0);
    }

    @ObfuscatedName("ld.ai(Llf;I)I")
    public final int method5210(class323 arg0) {
        for (int var2 = 0; var2 < this.field3844; var2++) {
            if (this.field3840[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ld.av(Llf;I)V")
    public final void method5211(class323 arg0) {
        if (this.field3842.remove(arg0.field3834) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3835 != null) {
            this.field3839.remove(arg0.field3835);
        }
    }

    @ObfuscatedName("ld.ax(Llf;I)V")
    public final void method5212(class323 arg0) {
        this.field3840[++this.field3844 - 1] = arg0;
    }

    @ObfuscatedName("ld.ar(Llf;B)V")
    public final void method5213(class323 arg0) {
        this.field3842.put(arg0.field3834, arg0);
        if (arg0.field3835 != null) {
            class323 var2 = (class323) this.field3839.put(arg0.field3835, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3835 = null;
            }
        }
    }

    @ObfuscatedName("ld.af(IB)V")
    public final void method5214(int arg0) {
        this.field3844--;
        if (arg0 < this.field3844) {
            System.arraycopy(this.field3840, arg0 + 1, this.field3840, arg0, this.field3844 - arg0);
        }
    }

    @ObfuscatedName("ld.bq(I)V")
    public final void method5233() {
        this.field3843 = null;
    }

    @ObfuscatedName("ld.bx(Ljava/util/Comparator;B)V")
    public final void method5218(Comparator arg0) {
        if (this.field3843 == null) {
            this.field3843 = arg0;
        } else if (this.field3843 instanceof class324) {
            ((class324) this.field3843).method5192(arg0);
        }
    }

    @ObfuscatedName("ld.e(II)[Llf;")
    public abstract class323[] method5108(int arg0);

    @ObfuscatedName("ld.f(I)Llf;")
    public abstract class323 method5102();
}
