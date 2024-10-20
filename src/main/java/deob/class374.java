package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("op")
public class class374 extends AbstractQueue {

    @ObfuscatedName("op.aj")
    public class372[] field4361;

    @ObfuscatedName("op.al")
    public Map field4359;

    @ObfuscatedName("op.ac")
    public int field4360;

    @ObfuscatedName("op.ab")
    public final Comparator field4362;

    @ObfuscatedName("op.an")
    public int field4363;

    public class374(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class374(int arg0, Comparator arg1) {
        this.field4363 = 0;
        this.field4361 = new class372[arg0];
        this.field4359 = new HashMap();
        this.field4362 = arg1;
    }

    @ObfuscatedName("op.aj(I)V")
    public void method6364() {
        int var1 = (this.field4361.length << 1) + 1;
        this.field4361 = (class372[]) ((class372[]) Arrays.copyOf(this.field4361, var1));
    }

    public int size() {
        return this.field4360;
    }

    public boolean offer(Object arg0) {
        if (this.field4359.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4363++;
        int var2 = this.field4360;
        if (var2 >= this.field4361.length) {
            this.method6364();
        }
        this.field4360++;
        if (var2 == 0) {
            this.field4361[0] = new class372(arg0, 0);
            this.field4359.put(arg0, this.field4361[0]);
        } else {
            this.field4361[var2] = new class372(arg0, var2);
            this.field4359.put(arg0, this.field4361[var2]);
            this.method6367(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4360 == 0 ? null : this.field4361[0].field4354;
    }

    public Object poll() {
        if (this.field4360 == 0) {
            return null;
        }
        this.field4363++;
        Object var1 = this.field4361[0].field4354;
        this.field4359.remove(var1);
        this.field4360--;
        if (this.field4360 == 0) {
            this.field4361[this.field4360] = null;
        } else {
            this.field4361[0] = this.field4361[this.field4360];
            this.field4361[0].field4352 = 0;
            this.field4361[this.field4360] = null;
            this.method6368(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class372 var2 = (class372) this.field4359.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4363++;
        this.field4360--;
        if (this.field4360 == var2.field4352) {
            this.field4361[this.field4360] = null;
            return true;
        }
        class372 var3 = this.field4361[this.field4360];
        this.field4361[this.field4360] = null;
        this.field4361[var2.field4352] = var3;
        this.field4361[var2.field4352].field4352 = var2.field4352;
        this.method6368(var2.field4352);
        if (this.field4361[var2.field4352] == var3) {
            this.method6367(var2.field4352);
        }
        return true;
    }

    @ObfuscatedName("op.al(II)V")
    public void method6367(int arg0) {
        class372 var2 = this.field4361[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class372 var4 = this.field4361[var3];
            if (this.field4362 == null) {
                if (((Comparable) var2.field4354).compareTo(var4.field4354) >= 0) {
                    break;
                }
            } else if (this.field4362.compare(var2.field4354, var4.field4354) >= 0) {
                break;
            }
            this.field4361[arg0] = var4;
            this.field4361[arg0].field4352 = arg0;
            arg0 = var3;
        }
        this.field4361[arg0] = var2;
        this.field4361[arg0].field4352 = arg0;
    }

    @ObfuscatedName("op.ac(II)V")
    public void method6368(int arg0) {
        class372 var2 = this.field4361[arg0];
        int var3 = this.field4360 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class372 var5 = this.field4361[var4];
            int var6 = (arg0 << 1) + 2;
            class372 var7 = this.field4361[var6];
            int var8;
            if (this.field4362 == null) {
                if (var6 < this.field4360 && ((Comparable) var5.field4354).compareTo(var7.field4354) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4360 && this.field4362.compare(var5.field4354, var7.field4354) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4362 == null) {
                if (((Comparable) var2.field4354).compareTo(this.field4361[var8].field4354) <= 0) {
                    break;
                }
            } else if (this.field4362.compare(var2.field4354, this.field4361[var8].field4354) <= 0) {
                break;
            }
            this.field4361[arg0] = this.field4361[var8];
            this.field4361[arg0].field4352 = arg0;
            arg0 = var8;
        }
        this.field4361[arg0] = var2;
        this.field4361[arg0].field4352 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4359.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4362 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4362);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class373(this);
    }
}
