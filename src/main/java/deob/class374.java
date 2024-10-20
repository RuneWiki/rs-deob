package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("nr")
public abstract class class374 {

    @ObfuscatedName("nr.o")
    public final int field4317;

    @ObfuscatedName("nr.n")
    public int field4315 = 0;

    @ObfuscatedName("nr.d")
    public class372[] field4316;

    @ObfuscatedName("nr.a")
    public HashMap field4318;

    @ObfuscatedName("nr.m")
    public HashMap field4319;

    @ObfuscatedName("nr.u")
    public Comparator field4314 = null;

    public class374(int arg0) {
        this.field4317 = arg0;
        this.field4316 = this.method5924(arg0);
        this.field4318 = new HashMap(arg0 / 8);
        this.field4319 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("nr.ae(S)V")
    public void method6020() {
        this.field4315 = 0;
        Arrays.fill(this.field4316, (Object) null);
        this.field4318.clear();
        this.field4319.clear();
    }

    @ObfuscatedName("nr.as(I)I")
    public int method6067() {
        return this.field4315;
    }

    @ObfuscatedName("nr.ay(S)Z")
    public boolean method6021() {
        return this.field4317 == this.field4315;
    }

    @ObfuscatedName("nr.ag(Lqy;I)Z")
    public boolean method6022(class465 arg0) {
        if (arg0.method7489()) {
            return this.field4318.containsKey(arg0) ? true : this.field4319.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nr.ad(Lqy;I)Lnb;")
    public class372 method6024(class465 arg0) {
        class372 var2 = this.method6025(arg0);
        return var2 == null ? this.method6026(arg0) : var2;
    }

    @ObfuscatedName("nr.af(Lqy;I)Lnb;")
    public class372 method6025(class465 arg0) {
        return arg0.method7489() ? (class372) this.field4318.get(arg0) : null;
    }

    @ObfuscatedName("nr.aw(Lqy;I)Lnb;")
    public class372 method6026(class465 arg0) {
        return arg0.method7489() ? (class372) this.field4319.get(arg0) : null;
    }

    @ObfuscatedName("nr.ai(Lqy;I)Z")
    public final boolean method6039(class465 arg0) {
        class372 var2 = this.method6025(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method6086(var2);
            return true;
        }
    }

    @ObfuscatedName("nr.ap(Lnb;B)V")
    public final void method6086(class372 arg0) {
        int var2 = this.method6034(arg0);
        if (var2 != -1) {
            this.method6037(var2);
            this.method6019(arg0);
        }
    }

    @ObfuscatedName("nr.az(Lqy;B)Lnb;")
    public class372 method6089(class465 arg0) {
        return this.method6030(arg0, (class465) null);
    }

    @ObfuscatedName("nr.an(Lqy;Lqy;B)Lnb;")
    public class372 method6030(class465 arg0, class465 arg1) {
        if (this.method6025(arg0) != null) {
            throw new IllegalStateException();
        }
        class372 var3 = this.method5922();
        var3.method5995(arg0, arg1);
        this.method6066(var3);
        this.method6072(var3);
        return var3;
    }

    @ObfuscatedName("nr.ah(II)Lnb;")
    public final class372 method6051(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4315) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4316[arg0];
    }

    @ObfuscatedName("nr.aa(B)V")
    public final void method6032() {
        if (this.field4314 == null) {
            Arrays.sort(this.field4316, 0, this.field4315);
        } else {
            Arrays.sort(this.field4316, 0, this.field4315, this.field4314);
        }
    }

    @ObfuscatedName("nr.at(Lnb;Lqy;Lqy;I)V")
    public final void method6033(class372 arg0, class465 arg1, class465 arg2) {
        this.method6019(arg0);
        arg0.method5995(arg1, arg2);
        this.method6072(arg0);
    }

    @ObfuscatedName("nr.bq(Lnb;B)I")
    public final int method6034(class372 arg0) {
        for (int var2 = 0; var2 < this.field4315; var2++) {
            if (this.field4316[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("nr.bn(Lnb;I)V")
    public final void method6019(class372 arg0) {
        if (this.field4318.remove(arg0.field4305) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4304 != null) {
            this.field4319.remove(arg0.field4304);
        }
    }

    @ObfuscatedName("nr.bl(Lnb;I)V")
    public final void method6066(class372 arg0) {
        this.field4316[++this.field4315 - 1] = arg0;
    }

    @ObfuscatedName("nr.bv(Lnb;I)V")
    public final void method6072(class372 arg0) {
        this.field4318.put(arg0.field4305, arg0);
        if (arg0.field4304 != null) {
            class372 var2 = (class372) this.field4319.put(arg0.field4304, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4304 = null;
            }
        }
    }

    @ObfuscatedName("nr.bu(IB)V")
    public final void method6037(int arg0) {
        this.field4315--;
        if (arg0 < this.field4315) {
            System.arraycopy(this.field4316, arg0 + 1, this.field4316, arg0, this.field4315 - arg0);
        }
    }

    @ObfuscatedName("nr.bb(I)V")
    public final void method6040() {
        this.field4314 = null;
    }

    @ObfuscatedName("nr.bt(Ljava/util/Comparator;S)V")
    public final void method6041(Comparator arg0) {
        if (this.field4314 == null) {
            this.field4314 = arg0;
        } else if (this.field4314 instanceof class373) {
            ((class373) this.field4314).method6009(arg0);
        }
    }

    @ObfuscatedName("nr.h(II)[Lnb;")
    public abstract class372[] method5924(int arg0);

    @ObfuscatedName("nr.s(I)Lnb;")
    public abstract class372 method5922();
}
