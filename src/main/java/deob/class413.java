package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("pg")
public class class413 implements Runnable {

    @ObfuscatedName("pg.aj")
    public Thread field4561;

    @ObfuscatedName("pg.al")
    public OutputStream field4555;

    @ObfuscatedName("pg.ac")
    public int field4554;

    @ObfuscatedName("pg.ab")
    public byte[] field4558;

    @ObfuscatedName("pg.an")
    public int field4556 = 0;

    @ObfuscatedName("pg.ao")
    public int field4562 = 0;

    @ObfuscatedName("pg.av")
    public IOException field4560;

    @ObfuscatedName("pg.aq")
    public boolean field4559;

    public class413(OutputStream arg0, int arg1) {
        this.field4555 = arg0;
        this.field4554 = arg1 + 1;
        this.field4558 = new byte[this.field4554];
        this.field4561 = new Thread(this);
        this.field4561.setDaemon(true);
        this.field4561.start();
    }

    @ObfuscatedName("pg.aj(I)Z")
    public boolean method7077() {
        if (!this.field4559) {
            return false;
        }
        try {
            this.field4555.close();
            if (this.field4560 == null) {
                this.field4560 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4560 == null) {
                this.field4560 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4560 != null) {
                        return;
                    }
                    if (this.field4556 <= this.field4562) {
                        var2 = this.field4562 - this.field4556;
                    } else {
                        var2 = this.field4562 + (this.field4554 - this.field4556);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4555.flush();
                    } catch (IOException var15) {
                        this.field4560 = var15;
                        return;
                    }
                    if (this.method7077()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4556 + var2 <= this.field4554) {
                    this.field4555.write(this.field4558, this.field4556, var2);
                } else {
                    int var6 = this.field4554 - this.field4556;
                    this.field4555.write(this.field4558, this.field4556, var6);
                    this.field4555.write(this.field4558, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4560 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4556 = (this.field4556 + var2) % this.field4554;
            }
        } while (!this.method7077());
    }

    @ObfuscatedName("pg.al([BIII)V")
    public void method7078(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4560 != null) {
                throw new IOException(this.field4560.toString());
            }
            int var5;
            if (this.field4556 <= this.field4562) {
                var5 = this.field4556 + (this.field4554 - this.field4562) - 1;
            } else {
                var5 = this.field4556 - this.field4562 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4562 + arg2 <= this.field4554) {
                System.arraycopy(arg0, arg1, this.field4558, this.field4562, arg2);
            } else {
                int var6 = this.field4554 - this.field4562;
                System.arraycopy(arg0, arg1, this.field4558, this.field4562, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4558, 0, arg2 - var6);
            }
            this.field4562 = (this.field4562 + arg2) % this.field4554;
            this.notifyAll();
        }
    }

    @ObfuscatedName("pg.ac(I)V")
    public void method7083() {
        synchronized (this) {
            this.field4559 = true;
            this.notifyAll();
        }
        try {
            this.field4561.join();
        } catch (InterruptedException var4) {
        }
    }
}
