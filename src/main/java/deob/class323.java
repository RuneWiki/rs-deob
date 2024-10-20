package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("lf")
public abstract class class323 {

    @ObfuscatedName("lf.h")
    public final int field3847;

    @ObfuscatedName("lf.n")
    public int field3843 = 0;

    @ObfuscatedName("lf.l")
    public class321[] field3844;

    @ObfuscatedName("lf.m")
    public HashMap field3845;

    @ObfuscatedName("lf.d")
    public HashMap field3846;

    @ObfuscatedName("lf.c")
    public Comparator field3842 = null;

    public class323(int arg0) {
        this.field3847 = arg0;
        this.field3844 = this.method5027(arg0);
        this.field3845 = new HashMap(arg0 / 8);
        this.field3846 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("lf.am(B)V")
    public void method5158() {
        this.field3843 = 0;
        Arrays.fill(this.field3844, (Object) null);
        this.field3845.clear();
        this.field3846.clear();
    }

    @ObfuscatedName("lf.ag(B)I")
    public int method5111() {
        return this.field3843;
    }

    @ObfuscatedName("lf.aq(I)Z")
    public boolean method5174() {
        return this.field3847 == this.field3843;
    }

    @ObfuscatedName("lf.at(Llw;I)Z")
    public boolean method5168(class327 arg0) {
        if (arg0.method5212()) {
            return this.field3845.containsKey(arg0) ? true : this.field3846.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("lf.aj(Llw;I)Llt;")
    public class321 method5114(class327 arg0) {
        class321 var2 = this.method5160(arg0);
        return var2 == null ? this.method5116(arg0) : var2;
    }

    @ObfuscatedName("lf.aw(Llw;B)Llt;")
    public class321 method5160(class327 arg0) {
        return arg0.method5212() ? (class321) this.field3845.get(arg0) : null;
    }

    @ObfuscatedName("lf.ap(Llw;I)Llt;")
    public class321 method5116(class327 arg0) {
        return arg0.method5212() ? (class321) this.field3846.get(arg0) : null;
    }

    @ObfuscatedName("lf.ax(Llw;I)Z")
    public final boolean method5117(class327 arg0) {
        class321 var2 = this.method5160(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5118(var2);
            return true;
        }
    }

    @ObfuscatedName("lf.as(Llt;I)V")
    public final void method5118(class321 arg0) {
        int var2 = this.method5154(arg0);
        if (var2 != -1) {
            this.method5127(var2);
            this.method5125(arg0);
        }
    }

    @ObfuscatedName("lf.ad(Llw;I)Llt;")
    public class321 method5119(class327 arg0) {
        return this.method5120(arg0, (class327) null);
    }

    @ObfuscatedName("lf.af(Llw;Llw;B)Llt;")
    public class321 method5120(class327 arg0, class327 arg1) {
        if (this.method5160(arg0) != null) {
            throw new IllegalStateException();
        }
        class321 var3 = this.method5026();
        var3.method5090(arg0, arg1);
        this.method5132(var3);
        this.method5126(var3);
        return var3;
    }

    @ObfuscatedName("lf.ao(II)Llt;")
    public final class321 method5121(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3843) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3844[arg0];
    }

    @ObfuscatedName("lf.ai(I)V")
    public final void method5122() {
        if (this.field3842 == null) {
            Arrays.sort(this.field3844, 0, this.field3843);
        } else {
            Arrays.sort(this.field3844, 0, this.field3843, this.field3842);
        }
    }

    @ObfuscatedName("lf.av(Llt;Llw;Llw;I)V")
    public final void method5123(class321 arg0, class327 arg1, class327 arg2) {
        this.method5125(arg0);
        arg0.method5090(arg1, arg2);
        this.method5126(arg0);
    }

    @ObfuscatedName("lf.az(Llt;I)I")
    public final int method5154(class321 arg0) {
        for (int var2 = 0; var2 < this.field3843; var2++) {
            if (this.field3844[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("lf.au(Llt;I)V")
    public final void method5125(class321 arg0) {
        if (this.field3845.remove(arg0.field3837) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3838 != null) {
            this.field3846.remove(arg0.field3838);
        }
    }

    @ObfuscatedName("lf.ab(Llt;B)V")
    public final void method5132(class321 arg0) {
        this.field3844[++this.field3843 - 1] = arg0;
    }

    @ObfuscatedName("lf.aa(Llt;I)V")
    public final void method5126(class321 arg0) {
        this.field3845.put(arg0.field3837, arg0);
        if (arg0.field3838 != null) {
            class321 var2 = (class321) this.field3846.put(arg0.field3838, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3838 = null;
            }
        }
    }

    @ObfuscatedName("lf.al(II)V")
    public final void method5127(int arg0) {
        this.field3843--;
        if (arg0 < this.field3843) {
            System.arraycopy(this.field3844, arg0 + 1, this.field3844, arg0, this.field3843 - arg0);
        }
    }

    @ObfuscatedName("lf.ar(I)V")
    public final void method5128() {
        this.field3842 = null;
    }

    @ObfuscatedName("lf.ak(Ljava/util/Comparator;B)V")
    public final void method5129(Comparator arg0) {
        if (this.field3842 == null) {
            this.field3842 = arg0;
        } else if (this.field3842 instanceof class322) {
            ((class322) this.field3842).method5100(arg0);
        }
    }

    @ObfuscatedName("lf.f(I)Llt;")
    public abstract class321 method5026();

    @ObfuscatedName("lf.o(II)[Llt;")
    public abstract class321[] method5027(int arg0);
}
