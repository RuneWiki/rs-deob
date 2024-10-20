package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ob")
public abstract class class403 {

    @ObfuscatedName("ob.l")
    public final int field4566;

    @ObfuscatedName("ob.k")
    public int field4569 = 0;

    @ObfuscatedName("ob.c")
    public class401[] field4568;

    @ObfuscatedName("ob.r")
    public HashMap field4567;

    @ObfuscatedName("ob.b")
    public HashMap field4570;

    @ObfuscatedName("ob.m")
    public Comparator field4571 = null;

    public class403(int arg0) {
        this.field4566 = arg0;
        this.field4568 = this.method6950(arg0);
        this.field4567 = new HashMap(arg0 / 8);
        this.field4570 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ob.ai(I)V")
    public void method7050() {
        this.field4569 = 0;
        Arrays.fill(this.field4568, (Object) null);
        this.field4567.clear();
        this.field4570.clear();
    }

    @ObfuscatedName("ob.ag(I)I")
    public int method7052() {
        return this.field4569;
    }

    @ObfuscatedName("ob.aw(I)Z")
    public boolean method7101() {
        return this.field4569 == this.field4566;
    }

    @ObfuscatedName("ob.ar(Lsi;S)Z")
    public boolean method7053(class497 arg0) {
        if (arg0.method8558()) {
            return this.field4567.containsKey(arg0) ? true : this.field4570.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ob.al(Lsi;B)Low;")
    public class401 method7054(class497 arg0) {
        class401 var2 = this.method7055(arg0);
        return var2 == null ? this.method7119(arg0) : var2;
    }

    @ObfuscatedName("ob.at(Lsi;B)Low;")
    public class401 method7055(class497 arg0) {
        return arg0.method8558() ? (class401) this.field4567.get(arg0) : null;
    }

    @ObfuscatedName("ob.aj(Lsi;I)Low;")
    public class401 method7119(class497 arg0) {
        return arg0.method8558() ? (class401) this.field4570.get(arg0) : null;
    }

    @ObfuscatedName("ob.ax(Lsi;I)Z")
    public final boolean method7057(class497 arg0) {
        class401 var2 = this.method7055(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7097(var2);
            return true;
        }
    }

    @ObfuscatedName("ob.az(Low;I)V")
    public final void method7097(class401 arg0) {
        int var2 = this.method7064(arg0);
        if (var2 != -1) {
            this.method7061(var2);
            this.method7065(arg0);
        }
    }

    @ObfuscatedName("ob.ap(Lsi;B)Low;")
    public class401 method7059(class497 arg0) {
        return this.method7060(arg0, (class497) null);
    }

    @ObfuscatedName("ob.ay(Lsi;Lsi;I)Low;")
    public class401 method7060(class497 arg0, class497 arg1) {
        if (this.method7055(arg0) != null) {
            throw new IllegalStateException();
        }
        class401 var3 = this.method6946();
        var3.method7027(arg0, arg1);
        this.method7051(var3);
        this.method7067(var3);
        return var3;
    }

    @ObfuscatedName("ob.ac(II)Low;")
    public final class401 method7069(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4569) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4568[arg0];
    }

    @ObfuscatedName("ob.av(I)V")
    public final void method7104() {
        if (this.field4571 == null) {
            Arrays.sort(this.field4568, 0, this.field4569);
        } else {
            Arrays.sort(this.field4568, 0, this.field4569, this.field4571);
        }
    }

    @ObfuscatedName("ob.aq(Low;Lsi;Lsi;I)V")
    public final void method7063(class401 arg0, class497 arg1, class497 arg2) {
        this.method7065(arg0);
        arg0.method7027(arg1, arg2);
        this.method7067(arg0);
    }

    @ObfuscatedName("ob.ak(Low;I)I")
    public final int method7064(class401 arg0) {
        for (int var2 = 0; var2 < this.field4569; var2++) {
            if (this.field4568[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ob.au(Low;I)V")
    public final void method7065(class401 arg0) {
        if (this.field4567.remove(arg0.field4563) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4562 != null) {
            this.field4570.remove(arg0.field4562);
        }
    }

    @ObfuscatedName("ob.ae(Low;I)V")
    public final void method7051(class401 arg0) {
        this.field4568[++this.field4569 - 1] = arg0;
    }

    @ObfuscatedName("ob.ah(Low;B)V")
    public final void method7067(class401 arg0) {
        this.field4567.put(arg0.field4563, arg0);
        if (arg0.field4562 != null) {
            class401 var2 = (class401) this.field4570.put(arg0.field4562, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4562 = null;
            }
        }
    }

    @ObfuscatedName("ob.ad(IB)V")
    public final void method7061(int arg0) {
        this.field4569--;
        if (arg0 < this.field4569) {
            System.arraycopy(this.field4568, arg0 + 1, this.field4568, arg0, this.field4569 - arg0);
        }
    }

    @ObfuscatedName("ob.ab(I)V")
    public final void method7124() {
        this.field4571 = null;
    }

    @ObfuscatedName("ob.an(Ljava/util/Comparator;I)V")
    public final void method7070(Comparator arg0) {
        if (this.field4571 == null) {
            this.field4571 = arg0;
        } else if (this.field4571 instanceof class402) {
            ((class402) this.field4571).method7040(arg0);
        }
    }

    @ObfuscatedName("ob.f(I)Low;")
    public abstract class401 method6946();

    @ObfuscatedName("ob.w(II)[Low;")
    public abstract class401[] method6950(int arg0);
}
