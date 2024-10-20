package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bj")
public final class class70 implements Runnable {

    @ObfuscatedName("bj.g")
    public InputStream field1285;

    @ObfuscatedName("bj.h")
    public OutputStream field1275;

    @ObfuscatedName("bj.s")
    public Socket field1276;

    @ObfuscatedName("bj.o")
    public boolean field1277 = false;

    @ObfuscatedName("bj.p")
    public class74 field1287;

    @ObfuscatedName("bj.x")
    public class79 field1279;

    @ObfuscatedName("bj.k")
    public byte[] field1280;

    @ObfuscatedName("bj.r")
    public int field1281 = 0;

    @ObfuscatedName("bj.z")
    public int field1282 = 0;

    @ObfuscatedName("bj.n")
    public boolean field1274 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1287 = arg1;
        this.field1276 = arg0;
        this.field1276.setSoTimeout(30000);
        this.field1276.setTcpNoDelay(true);
        this.field1285 = this.field1276.getInputStream();
        this.field1275 = this.field1276.getOutputStream();
    }

    @ObfuscatedName("bj.h(B)V")
    public void method1383() {
        if (this.field1277) {
            return;
        }
        synchronized (this) {
            this.field1277 = true;
            this.notifyAll();
        }
        if (this.field1279 != null) {
            while (this.field1279.field1392 == 0) {
                class126.method2355(1L);
            }
            if (this.field1279.field1392 == 1) {
                try {
                    ((Thread) this.field1279.field1397).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1279 = null;
    }

    public void finalize() {
        this.method1383();
    }

    @ObfuscatedName("bj.s(B)I")
    public int method1400() throws IOException {
        return this.field1277 ? 0 : this.field1285.read();
    }

    @ObfuscatedName("bj.o(I)I")
    public int method1386() throws IOException {
        return this.field1277 ? 0 : this.field1285.available();
    }

    @ObfuscatedName("bj.p([BIII)V")
    public void method1387(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1277) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1285.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bj.x([BIII)V")
    public void method1388(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1277) {
            return;
        }
        if (this.field1274) {
            this.field1274 = false;
            throw new IOException();
        }
        if (this.field1280 == null) {
            this.field1280 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1280[this.field1282] = arg0[arg1 + var5];
                this.field1282 = (this.field1282 + 1) % 5000;
                if ((this.field1281 + 4900) % 5000 == this.field1282) {
                    throw new IOException();
                }
            }
            if (this.field1279 == null) {
                this.field1279 = this.field1287.method1521(this, 3);
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
                        if (this.field1282 == this.field1281) {
                            if (this.field1277) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1281;
                        if (this.field1282 >= this.field1281) {
                            var4 = this.field1282 - this.field1281;
                        } else {
                            var4 = 5000 - this.field1281;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1275.write(this.field1280, var3, var4);
                    } catch (IOException var12) {
                        this.field1274 = true;
                    }
                    this.field1281 = (this.field1281 + var4) % 5000;
                    try {
                        if (this.field1282 == this.field1281) {
                            this.field1275.flush();
                        }
                    } catch (IOException var11) {
                        this.field1274 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1285 != null) {
                        this.field1285.close();
                    }
                    if (this.field1275 != null) {
                        this.field1275.close();
                    }
                    if (this.field1276 != null) {
                        this.field1276.close();
                    }
                } catch (IOException var10) {
                }
                this.field1280 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method1330((String) null, var15);
        }
    }
}
