package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("mx")
public abstract class class340 {

    @ObfuscatedName("mx.j")
    public final int field3957;

    @ObfuscatedName("mx.b")
    public int field3958 = 0;

    @ObfuscatedName("mx.x")
    public class338[] field3960;

    @ObfuscatedName("mx.y")
    public HashMap field3955;

    @ObfuscatedName("mx.k")
    public HashMap field3959;

    @ObfuscatedName("mx.t")
    public Comparator field3956 = null;

    public class340(int arg0) {
        this.field3957 = arg0;
        this.field3960 = this.method5403(arg0);
        this.field3955 = new HashMap(arg0 / 8);
        this.field3959 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("mx.ag(I)V")
    public void method5495() {
        this.field3958 = 0;
        Arrays.fill(this.field3960, (Object) null);
        this.field3955.clear();
        this.field3959.clear();
    }

    @ObfuscatedName("mx.ae(I)I")
    public int method5496() {
        return this.field3958;
    }

    @ObfuscatedName("mx.aq(B)Z")
    public boolean method5497() {
        return this.field3958 == this.field3957;
    }

    @ObfuscatedName("mx.al(Lpb;I)Z")
    public boolean method5498(class422 arg0) {
        if (arg0.method6816()) {
            return this.field3955.containsKey(arg0) ? true : this.field3959.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mx.am(Lpb;I)Lla;")
    public class338 method5499(class422 arg0) {
        class338 var2 = this.method5558(arg0);
        return var2 == null ? this.method5501(arg0) : var2;
    }

    @ObfuscatedName("mx.ai(Lpb;I)Lla;")
    public class338 method5558(class422 arg0) {
        return arg0.method6816() ? (class338) this.field3955.get(arg0) : null;
    }

    @ObfuscatedName("mx.ah(Lpb;B)Lla;")
    public class338 method5501(class422 arg0) {
        return arg0.method6816() ? (class338) this.field3959.get(arg0) : null;
    }

    @ObfuscatedName("mx.as(Lpb;B)Z")
    public final boolean method5569(class422 arg0) {
        class338 var2 = this.method5558(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5520(var2);
            return true;
        }
    }

    @ObfuscatedName("mx.at(Lla;I)V")
    public final void method5520(class338 arg0) {
        int var2 = this.method5508(arg0);
        if (var2 != -1) {
            this.method5512(var2);
            this.method5509(arg0);
        }
    }

    @ObfuscatedName("mx.az(Lpb;I)Lla;")
    public class338 method5510(class422 arg0) {
        return this.method5518(arg0, (class422) null);
    }

    @ObfuscatedName("mx.ac(Lpb;Lpb;I)Lla;")
    public class338 method5518(class422 arg0, class422 arg1) {
        if (this.method5558(arg0) != null) {
            throw new IllegalStateException();
        }
        class338 var3 = this.method5402();
        var3.method5472(arg0, arg1);
        this.method5552(var3);
        this.method5511(var3);
        return var3;
    }

    @ObfuscatedName("mx.ak(II)Lla;")
    public final class338 method5505(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3958) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3960[arg0];
    }

    @ObfuscatedName("mx.ab(B)V")
    public final void method5506() {
        if (this.field3956 == null) {
            Arrays.sort(this.field3960, 0, this.field3958);
        } else {
            Arrays.sort(this.field3960, 0, this.field3958, this.field3956);
        }
    }

    @ObfuscatedName("mx.ar(Lla;Lpb;Lpb;B)V")
    public final void method5507(class338 arg0, class422 arg1, class422 arg2) {
        this.method5509(arg0);
        arg0.method5472(arg1, arg2);
        this.method5511(arg0);
    }

    @ObfuscatedName("mx.ad(Lla;B)I")
    public final int method5508(class338 arg0) {
        for (int var2 = 0; var2 < this.field3958; var2++) {
            if (this.field3960[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("mx.an(Lla;B)V")
    public final void method5509(class338 arg0) {
        if (this.field3955.remove(arg0.field3953) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3952 != null) {
            this.field3959.remove(arg0.field3952);
        }
    }

    @ObfuscatedName("mx.ax(Lla;B)V")
    public final void method5552(class338 arg0) {
        this.field3960[++this.field3958 - 1] = arg0;
    }

    @ObfuscatedName("mx.av(Lla;I)V")
    public final void method5511(class338 arg0) {
        this.field3955.put(arg0.field3953, arg0);
        if (arg0.field3952 != null) {
            class338 var2 = (class338) this.field3959.put(arg0.field3952, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3952 = null;
            }
        }
    }

    @ObfuscatedName("mx.ap(II)V")
    public final void method5512(int arg0) {
        this.field3958--;
        if (arg0 < this.field3958) {
            System.arraycopy(this.field3960, arg0 + 1, this.field3960, arg0, this.field3958 - arg0);
        }
    }

    @ObfuscatedName("mx.au(B)V")
    public final void method5514() {
        this.field3956 = null;
    }

    @ObfuscatedName("mx.aj(Ljava/util/Comparator;B)V")
    public final void method5515(Comparator arg0) {
        if (this.field3956 == null) {
            this.field3956 = arg0;
        } else if (this.field3956 instanceof class339) {
            ((class339) this.field3956).method5486(arg0);
        }
    }

    @ObfuscatedName("mx.i(I)Lla;")
    public abstract class338 method5402();

    @ObfuscatedName("mx.w(IB)[Lla;")
    public abstract class338[] method5403(int arg0);
}
