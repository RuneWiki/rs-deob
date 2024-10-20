package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ku")
public abstract class class300 {

    @ObfuscatedName("ku.a")
    public final int field3838;

    @ObfuscatedName("ku.l")
    public int field3835 = 0;

    @ObfuscatedName("ku.b")
    public class297[] field3836;

    @ObfuscatedName("ku.e")
    public HashMap field3837;

    @ObfuscatedName("ku.x")
    public HashMap field3834;

    @ObfuscatedName("ku.p")
    public Comparator field3839 = null;

    public class300(int arg0) {
        this.field3838 = arg0;
        this.field3836 = this.method4897(arg0);
        this.field3837 = new HashMap(arg0 / 8);
        this.field3834 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ku.c(I)V")
    public void method4907() {
        this.field3835 = 0;
        Arrays.fill(this.field3836, (Object) null);
        this.field3837.clear();
        this.field3834.clear();
    }

    @ObfuscatedName("ku.u(I)I")
    public int method4908() {
        return this.field3835;
    }

    @ObfuscatedName("ku.k(B)Z")
    public boolean method4978() {
        return this.field3838 == this.field3835;
    }

    @ObfuscatedName("ku.z(Lkb;I)Z")
    public boolean method4973(class306 arg0) {
        if (arg0.method5005()) {
            return this.field3837.containsKey(arg0) ? true : this.field3834.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ku.w(Lkb;I)Lkv;")
    public class297 method4911(class306 arg0) {
        class297 var2 = this.method4912(arg0);
        return var2 == null ? this.method4910(arg0) : var2;
    }

    @ObfuscatedName("ku.s(Lkb;I)Lkv;")
    public class297 method4912(class306 arg0) {
        return arg0.method5005() ? (class297) this.field3837.get(arg0) : null;
    }

    @ObfuscatedName("ku.d(Lkb;B)Lkv;")
    public class297 method4910(class306 arg0) {
        return arg0.method5005() ? (class297) this.field3834.get(arg0) : null;
    }

    @ObfuscatedName("ku.f(Lkb;I)Z")
    public final boolean method4914(class306 arg0) {
        class297 var2 = this.method4912(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4915(var2);
            return true;
        }
    }

    @ObfuscatedName("ku.r(Lkv;B)V")
    public final void method4915(class297 arg0) {
        int var2 = this.method4951(arg0);
        if (var2 != -1) {
            this.method4970(var2);
            this.method4922(arg0);
        }
    }

    @ObfuscatedName("ku.y(Lkb;I)Lkv;")
    public class297 method4941(class306 arg0) {
        return this.method4917(arg0, (class306) null);
    }

    @ObfuscatedName("ku.h(Lkb;Lkb;B)Lkv;")
    public class297 method4917(class306 arg0, class306 arg1) {
        if (this.method4911(arg0) != null) {
            throw new IllegalStateException();
        }
        class297 var3 = this.method4899();
        var3.method4873(arg0, arg1);
        this.method4923(var3);
        this.method4924(var3);
        return var3;
    }

    @ObfuscatedName("ku.av(II)Lkv;")
    public final class297 method4918(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3835) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.field3836[arg0];
    }

    @ObfuscatedName("ku.aj(I)V")
    public final void method4919() {
        if (this.field3839 == null) {
            Arrays.sort(this.field3836, 0, this.field3835);
        } else {
            Arrays.sort(this.field3836, 0, this.field3835, this.field3839);
        }
    }

    @ObfuscatedName("ku.ae(Lkv;Lkb;Lkb;I)V")
    public final void method4957(class297 arg0, class306 arg1, class306 arg2) {
        this.method4922(arg0);
        arg0.method4873(arg1, arg2);
        this.method4924(arg0);
    }

    @ObfuscatedName("ku.am(Lkv;I)I")
    public final int method4951(class297 arg0) {
        for (int var2 = 0; var2 < this.field3835; var2++) {
            if (this.field3836[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ku.az(Lkv;B)V")
    public final void method4922(class297 arg0) {
        if (this.field3837.remove(arg0.field3827) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3826 != null) {
            this.field3834.remove(arg0.field3826);
        }
    }

    @ObfuscatedName("ku.ap(Lkv;I)V")
    public final void method4923(class297 arg0) {
        this.field3836[++this.field3835 - 1] = arg0;
    }

    @ObfuscatedName("ku.ah(Lkv;B)V")
    public final void method4924(class297 arg0) {
        this.field3837.put(arg0.field3827, arg0);
        if (arg0.field3826 != null) {
            this.field3834.put(arg0.field3826, arg0);
        }
    }

    @ObfuscatedName("ku.au(II)V")
    public final void method4970(int arg0) {
        this.field3835--;
        if (arg0 < this.field3835) {
            System.arraycopy(this.field3836, arg0 + 1, this.field3836, arg0, this.field3835 - arg0);
        }
    }

    @ObfuscatedName("ku.ax(I)V")
    public final void method4927() {
        this.field3839 = null;
    }

    @ObfuscatedName("ku.ar(Ljava/util/Comparator;B)V")
    public final void method4943(Comparator arg0) {
        if (this.field3839 == null) {
            this.field3839 = arg0;
        } else if (this.field3839 instanceof class298) {
            ((class298) this.field3839).method4882(arg0);
        }
    }

    @ObfuscatedName("ku.t(B)Lkv;")
    public abstract class297 method4899();

    @ObfuscatedName("ku.q(II)[Lkv;")
    public abstract class297[] method4897(int arg0);
}
