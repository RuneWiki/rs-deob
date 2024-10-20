package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("by")
public final class class70 implements Runnable {

    @ObfuscatedName("by.y")
    public InputStream field1279;

    @ObfuscatedName("by.m")
    public OutputStream field1274;

    @ObfuscatedName("by.d")
    public Socket field1275;

    @ObfuscatedName("by.k")
    public boolean field1273 = false;

    @ObfuscatedName("by.n")
    public class74 field1276;

    @ObfuscatedName("by.s")
    public class79 field1277;

    @ObfuscatedName("by.x")
    public byte[] field1285;

    @ObfuscatedName("by.b")
    public int field1283 = 0;

    @ObfuscatedName("by.j")
    public int field1280 = 0;

    @ObfuscatedName("by.p")
    public boolean field1281 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1276 = arg1;
        this.field1275 = arg0;
        this.field1275.setSoTimeout(30000);
        this.field1275.setTcpNoDelay(true);
        this.field1279 = this.field1275.getInputStream();
        this.field1274 = this.field1275.getOutputStream();
    }

    @ObfuscatedName("by.k(B)V")
    public void method1391() {
        if (this.field1273) {
            return;
        }
        synchronized (this) {
            this.field1273 = true;
            this.notifyAll();
        }
        if (this.field1277 != null) {
            while (this.field1277.field1409 == 0) {
                class126.method1326(1L);
            }
            if (this.field1277.field1409 == 1) {
                try {
                    ((Thread) this.field1277.field1413).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1277 = null;
    }

    public void finalize() {
        this.method1391();
    }

    @ObfuscatedName("by.n(B)I")
    public int method1380() throws IOException {
        return this.field1273 ? 0 : this.field1279.read();
    }

    @ObfuscatedName("by.s(B)I")
    public int method1381() throws IOException {
        return this.field1273 ? 0 : this.field1279.available();
    }

    @ObfuscatedName("by.x([BIIB)V")
    public void method1385(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1273) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1279.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("by.b([BIII)V")
    public void method1383(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1273) {
            return;
        }
        if (this.field1281) {
            this.field1281 = false;
            throw new IOException();
        }
        if (this.field1285 == null) {
            this.field1285 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1285[this.field1280] = arg0[arg1 + var5];
                this.field1280 = (this.field1280 + 1) % 5000;
                if ((this.field1283 + 4900) % 5000 == this.field1280) {
                    throw new IOException();
                }
            }
            if (this.field1277 == null) {
                this.field1277 = this.field1276.method1495(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1283 == this.field1280) {
                            if (this.field1273) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1283;
                        if (this.field1280 >= this.field1283) {
                            var4 = this.field1280 - this.field1283;
                        } else {
                            var4 = 5000 - this.field1283;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1274.write(this.field1285, var3, var4);
                    } catch (IOException var12) {
                        this.field1281 = true;
                    }
                    this.field1283 = (this.field1283 + var4) % 5000;
                    try {
                        if (this.field1283 == this.field1280) {
                            this.field1274.flush();
                        }
                    } catch (IOException var11) {
                        this.field1281 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1279 != null) {
                        this.field1279.close();
                    }
                    if (this.field1274 != null) {
                        this.field1274.close();
                    }
                    if (this.field1275 != null) {
                        this.field1275.close();
                    }
                } catch (IOException var10) {
                }
                this.field1285 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method210((String) null, var15);
        }
    }
}
