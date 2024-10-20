package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pn")
public class class409 extends AbstractQueue {

    @ObfuscatedName("pn.am")
    public class407[] field4520;

    @ObfuscatedName("pn.ap")
    public Map field4522;

    @ObfuscatedName("pn.af")
    public int field4521;

    @ObfuscatedName("pn.aj")
    public final Comparator field4523;

    @ObfuscatedName("pn.aq")
    public int field4524;

    public class409(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class409(int arg0, Comparator arg1) {
        this.field4524 = 0;
        this.field4520 = new class407[arg0];
        this.field4522 = new HashMap();
        this.field4523 = arg1;
    }

    @ObfuscatedName("pn.am(B)V")
    public void method6910() {
        int var1 = (this.field4520.length << 1) + 1;
        this.field4520 = (class407[]) ((class407[]) Arrays.copyOf(this.field4520, var1));
    }

    public int size() {
        return this.field4521;
    }

    public boolean offer(Object arg0) {
        if (this.field4522.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4524++;
        int var2 = this.field4521;
        if (var2 >= this.field4520.length) {
            this.method6910();
        }
        this.field4521++;
        if (var2 == 0) {
            this.field4520[0] = new class407(arg0, 0);
            this.field4522.put(arg0, this.field4520[0]);
        } else {
            this.field4520[var2] = new class407(arg0, var2);
            this.field4522.put(arg0, this.field4520[var2]);
            this.method6915(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4521 == 0 ? null : this.field4520[0].field4513;
    }

    public Object poll() {
        if (this.field4521 == 0) {
            return null;
        }
        this.field4524++;
        Object var1 = this.field4520[0].field4513;
        this.field4522.remove(var1);
        this.field4521--;
        if (this.field4521 == 0) {
            this.field4520[this.field4521] = null;
        } else {
            this.field4520[0] = this.field4520[this.field4521];
            this.field4520[0].field4514 = 0;
            this.field4520[this.field4521] = null;
            this.method6914(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class407 var2 = (class407) this.field4522.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4524++;
        this.field4521--;
        if (this.field4521 == var2.field4514) {
            this.field4520[this.field4521] = null;
            return true;
        }
        class407 var3 = this.field4520[this.field4521];
        this.field4520[this.field4521] = null;
        this.field4520[var2.field4514] = var3;
        this.field4520[var2.field4514].field4514 = var2.field4514;
        this.method6914(var2.field4514);
        if (this.field4520[var2.field4514] == var3) {
            this.method6915(var2.field4514);
        }
        return true;
    }

    @ObfuscatedName("pn.ap(IB)V")
    public void method6915(int arg0) {
        class407 var2 = this.field4520[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class407 var4 = this.field4520[var3];
            if (this.field4523 == null) {
                if (((Comparable) var2.field4513).compareTo(var4.field4513) >= 0) {
                    break;
                }
            } else if (this.field4523.compare(var2.field4513, var4.field4513) >= 0) {
                break;
            }
            this.field4520[arg0] = var4;
            this.field4520[arg0].field4514 = arg0;
            arg0 = var3;
        }
        this.field4520[arg0] = var2;
        this.field4520[arg0].field4514 = arg0;
    }

    @ObfuscatedName("pn.af(II)V")
    public void method6914(int arg0) {
        class407 var2 = this.field4520[arg0];
        int var3 = this.field4521 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class407 var5 = this.field4520[var4];
            int var6 = (arg0 << 1) + 2;
            class407 var7 = this.field4520[var6];
            int var8;
            if (this.field4523 == null) {
                if (var6 < this.field4521 && ((Comparable) var5.field4513).compareTo(var7.field4513) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4521 && this.field4523.compare(var5.field4513, var7.field4513) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4523 == null) {
                if (((Comparable) var2.field4513).compareTo(this.field4520[var8].field4513) <= 0) {
                    break;
                }
            } else if (this.field4523.compare(var2.field4513, this.field4520[var8].field4513) <= 0) {
                break;
            }
            this.field4520[arg0] = this.field4520[var8];
            this.field4520[arg0].field4514 = arg0;
            arg0 = var8;
        }
        this.field4520[arg0] = var2;
        this.field4520[arg0].field4514 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4522.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4523 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4523);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class408(this);
    }
}
