package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kd")
public abstract class class292 {

    @ObfuscatedName("kd.x")
    public final int field3703;

    @ObfuscatedName("kd.h")
    public int field3702 = 0;

    @ObfuscatedName("kd.f")
    public class289[] field3707;

    @ObfuscatedName("kd.p")
    public HashMap field3705;

    @ObfuscatedName("kd.m")
    public HashMap field3706;

    @ObfuscatedName("kd.q")
    public Comparator field3704 = null;

    public class292(int arg0) {
        this.field3703 = arg0;
        this.field3707 = this.method5130(arg0);
        this.field3705 = new HashMap(arg0 / 8);
        this.field3706 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kd.e(I)V")
    public void method5200() {
        this.field3702 = 0;
        Arrays.fill(this.field3707, (Object) null);
        this.field3705.clear();
        this.field3706.clear();
    }

    @ObfuscatedName("kd.r(I)I")
    public int method5140() {
        return this.field3702;
    }

    @ObfuscatedName("kd.t(I)Z")
    public boolean method5141() {
        return this.field3703 == this.field3702;
    }

    @ObfuscatedName("kd.l(Lkx;B)Z")
    public boolean method5151(class298 arg0) {
        if (arg0.method5238()) {
            return this.field3705.containsKey(arg0) ? true : this.field3706.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kd.o(Lkx;I)Lkn;")
    public class289 method5143(class298 arg0) {
        class289 var2 = this.method5174(arg0);
        return var2 == null ? this.method5211(arg0) : var2;
    }

    @ObfuscatedName("kd.u(Lkx;B)Lkn;")
    public class289 method5174(class298 arg0) {
        return arg0.method5238() ? (class289) this.field3705.get(arg0) : null;
    }

    @ObfuscatedName("kd.y(Lkx;I)Lkn;")
    public class289 method5211(class298 arg0) {
        return arg0.method5238() ? (class289) this.field3706.get(arg0) : null;
    }

    @ObfuscatedName("kd.k(Lkx;I)Z")
    public final boolean method5146(class298 arg0) {
        class289 var2 = this.method5174(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5147(var2);
            return true;
        }
    }

    @ObfuscatedName("kd.v(Lkn;B)V")
    public final void method5147(class289 arg0) {
        int var2 = this.method5153(arg0);
        if (var2 != -1) {
            this.method5157(var2);
            this.method5154(arg0);
        }
    }

    @ObfuscatedName("kd.c(Lkx;I)Lkn;")
    public class289 method5148(class298 arg0) {
        return this.method5149(arg0, (class298) null);
    }

    @ObfuscatedName("kd.aa(Lkx;Lkx;I)Lkn;")
    public class289 method5149(class298 arg0, class298 arg1) {
        if (this.method5174(arg0) != null) {
            throw new IllegalStateException();
        }
        class289 var3 = this.method5128();
        var3.method5103(arg0, arg1);
        this.method5155(var3);
        this.method5184(var3);
        return var3;
    }

    @ObfuscatedName("kd.ab(IB)Lkn;")
    public final class289 method5207(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3702) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3707[arg0];
    }

    @ObfuscatedName("kd.ah(I)V")
    public final void method5180() {
        if (this.field3704 == null) {
            Arrays.sort(this.field3707, 0, this.field3702);
        } else {
            Arrays.sort(this.field3707, 0, this.field3702, this.field3704);
        }
    }

    @ObfuscatedName("kd.aw(Lkn;Lkx;Lkx;I)V")
    public final void method5144(class289 arg0, class298 arg1, class298 arg2) {
        this.method5154(arg0);
        arg0.method5103(arg1, arg2);
        this.method5184(arg0);
    }

    @ObfuscatedName("kd.an(Lkn;I)I")
    public final int method5153(class289 arg0) {
        for (int var2 = 0; var2 < this.field3702; var2++) {
            if (this.field3707[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kd.at(Lkn;I)V")
    public final void method5154(class289 arg0) {
        if (this.field3705.remove(arg0.field3694) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3695 != null) {
            this.field3706.remove(arg0.field3695);
        }
    }

    @ObfuscatedName("kd.ae(Lkn;I)V")
    public final void method5155(class289 arg0) {
        this.field3707[++this.field3702 - 1] = arg0;
    }

    @ObfuscatedName("kd.av(Lkn;I)V")
    public final void method5184(class289 arg0) {
        this.field3705.put(arg0.field3694, arg0);
        if (arg0.field3695 != null) {
            class289 var2 = (class289) this.field3706.put(arg0.field3695, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3695 = null;
            }
        }
    }

    @ObfuscatedName("kd.au(IB)V")
    public final void method5157(int arg0) {
        this.field3702--;
        if (arg0 < this.field3702) {
            System.arraycopy(this.field3707, arg0 + 1, this.field3707, arg0, this.field3702 - arg0);
        }
    }

    @ObfuscatedName("kd.aj(B)V")
    public final void method5206() {
        this.field3704 = null;
    }

    @ObfuscatedName("kd.as(Ljava/util/Comparator;I)V")
    public final void method5159(Comparator arg0) {
        if (this.field3704 == null) {
            this.field3704 = arg0;
        } else if (this.field3704 instanceof class290) {
            ((class290) this.field3704).method5126(arg0);
        }
    }

    @ObfuscatedName("kd.a(I)Lkn;")
    public abstract class289 method5128();

    @ObfuscatedName("kd.s(IB)[Lkn;")
    public abstract class289[] method5130(int arg0);
}
