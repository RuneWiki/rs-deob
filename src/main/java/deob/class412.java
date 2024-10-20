package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pj")
public class class412 extends AbstractQueue {

    @ObfuscatedName("pj.aq")
    public class410[] field4563;

    @ObfuscatedName("pj.aw")
    public Map field4565;

    @ObfuscatedName("pj.al")
    public int field4564;

    @ObfuscatedName("pj.ai")
    public final Comparator field4566;

    @ObfuscatedName("pj.ar")
    public int field4562;

    public class412(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class412(int arg0, Comparator arg1) {
        this.field4562 = 0;
        this.field4563 = new class410[arg0];
        this.field4565 = new HashMap();
        this.field4566 = arg1;
    }

    @ObfuscatedName("pj.aq(B)V")
    public void method6957() {
        int var1 = (this.field4563.length << 1) + 1;
        this.field4563 = (class410[]) ((class410[]) Arrays.copyOf(this.field4563, var1));
    }

    public int size() {
        return this.field4564;
    }

    public boolean offer(Object arg0) {
        if (this.field4565.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4562++;
        int var2 = this.field4564;
        if (var2 >= this.field4563.length) {
            this.method6957();
        }
        this.field4564++;
        if (var2 == 0) {
            this.field4563[0] = new class410(arg0, 0);
            this.field4565.put(arg0, this.field4563[0]);
        } else {
            this.field4563[var2] = new class410(arg0, var2);
            this.field4565.put(arg0, this.field4563[var2]);
            this.method6949(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4564 == 0 ? null : this.field4563[0].field4555;
    }

    public Object poll() {
        if (this.field4564 == 0) {
            return null;
        }
        this.field4562++;
        Object var1 = this.field4563[0].field4555;
        this.field4565.remove(var1);
        this.field4564--;
        if (this.field4564 == 0) {
            this.field4563[this.field4564] = null;
        } else {
            this.field4563[0] = this.field4563[this.field4564];
            this.field4563[0].field4554 = 0;
            this.field4563[this.field4564] = null;
            this.method6964(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class410 var2 = (class410) this.field4565.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4562++;
        this.field4564--;
        if (this.field4564 == var2.field4554) {
            this.field4563[this.field4564] = null;
            return true;
        }
        class410 var3 = this.field4563[this.field4564];
        this.field4563[this.field4564] = null;
        this.field4563[var2.field4554] = var3;
        this.field4563[var2.field4554].field4554 = var2.field4554;
        this.method6964(var2.field4554);
        if (this.field4563[var2.field4554] == var3) {
            this.method6949(var2.field4554);
        }
        return true;
    }

    @ObfuscatedName("pj.aw(IB)V")
    public void method6949(int arg0) {
        class410 var2 = this.field4563[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class410 var4 = this.field4563[var3];
            if (this.field4566 == null) {
                if (((Comparable) var2.field4555).compareTo(var4.field4555) >= 0) {
                    break;
                }
            } else if (this.field4566.compare(var2.field4555, var4.field4555) >= 0) {
                break;
            }
            this.field4563[arg0] = var4;
            this.field4563[arg0].field4554 = arg0;
            arg0 = var3;
        }
        this.field4563[arg0] = var2;
        this.field4563[arg0].field4554 = arg0;
    }

    @ObfuscatedName("pj.al(II)V")
    public void method6964(int arg0) {
        class410 var2 = this.field4563[arg0];
        int var3 = this.field4564 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class410 var5 = this.field4563[var4];
            int var6 = (arg0 << 1) + 2;
            class410 var7 = this.field4563[var6];
            int var8;
            if (this.field4566 == null) {
                if (var6 < this.field4564 && ((Comparable) var5.field4555).compareTo(var7.field4555) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4564 && this.field4566.compare(var5.field4555, var7.field4555) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4566 == null) {
                if (((Comparable) var2.field4555).compareTo(this.field4563[var8].field4555) <= 0) {
                    break;
                }
            } else if (this.field4566.compare(var2.field4555, this.field4563[var8].field4555) <= 0) {
                break;
            }
            this.field4563[arg0] = this.field4563[var8];
            this.field4563[arg0].field4554 = arg0;
            arg0 = var8;
        }
        this.field4563[arg0] = var2;
        this.field4563[arg0].field4554 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4565.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4566 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4566);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class411(this);
    }
}
