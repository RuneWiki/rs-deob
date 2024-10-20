package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bm")
public final class class70 implements Runnable {

    @ObfuscatedName("bm.p")
    public InputStream field1284;

    @ObfuscatedName("bm.i")
    public OutputStream field1283;

    @ObfuscatedName("bm.o")
    public Socket field1296;

    @ObfuscatedName("bm.n")
    public boolean field1285 = false;

    @ObfuscatedName("bm.l")
    public class74 field1286;

    @ObfuscatedName("bm.v")
    public class79 field1287;

    @ObfuscatedName("bm.g")
    public byte[] field1288;

    @ObfuscatedName("bm.x")
    public int field1297 = 0;

    @ObfuscatedName("bm.c")
    public int field1290 = 0;

    @ObfuscatedName("bm.f")
    public boolean field1291 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1286 = arg1;
        this.field1296 = arg0;
        this.field1296.setSoTimeout(30000);
        this.field1296.setTcpNoDelay(true);
        this.field1284 = this.field1296.getInputStream();
        this.field1283 = this.field1296.getOutputStream();
    }

    @ObfuscatedName("bm.o(B)V")
    public void method1410() {
        if (this.field1285) {
            return;
        }
        synchronized (this) {
            this.field1285 = true;
            this.notifyAll();
        }
        if (this.field1287 != null) {
            while (this.field1287.field1413 == 0) {
                class126.method2420(1L);
            }
            if (this.field1287.field1413 == 1) {
                try {
                    ((Thread) this.field1287.field1412).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1287 = null;
    }

    public void finalize() {
        this.method1410();
    }

    @ObfuscatedName("bm.n(B)I")
    public int method1411() throws IOException {
        return this.field1285 ? 0 : this.field1284.read();
    }

    @ObfuscatedName("bm.l(B)I")
    public int method1409() throws IOException {
        return this.field1285 ? 0 : this.field1284.available();
    }

    @ObfuscatedName("bm.v([BIII)V")
    public void method1430(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1285) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1284.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bm.g([BIII)V")
    public void method1414(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1285) {
            return;
        }
        if (this.field1291) {
            this.field1291 = false;
            throw new IOException();
        }
        if (this.field1288 == null) {
            this.field1288 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1288[this.field1290] = arg0[arg1 + var5];
                this.field1290 = (this.field1290 + 1) % 5000;
                if ((this.field1297 + 4900) % 5000 == this.field1290) {
                    throw new IOException();
                }
            }
            if (this.field1287 == null) {
                this.field1287 = this.field1286.method1521(this, 3);
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
                        if (this.field1297 == this.field1290) {
                            if (this.field1285) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1297;
                        if (this.field1290 >= this.field1297) {
                            var4 = this.field1290 - this.field1297;
                        } else {
                            var4 = 5000 - this.field1297;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1283.write(this.field1288, var3, var4);
                    } catch (IOException var12) {
                        this.field1291 = true;
                    }
                    this.field1297 = (this.field1297 + var4) % 5000;
                    try {
                        if (this.field1297 == this.field1290) {
                            this.field1283.flush();
                        }
                    } catch (IOException var11) {
                        this.field1291 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1284 != null) {
                        this.field1284.close();
                    }
                    if (this.field1283 != null) {
                        this.field1283.close();
                    }
                    if (this.field1296 != null) {
                        this.field1296.close();
                    }
                } catch (IOException var10) {
                }
                this.field1288 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method1379((String) null, var15);
        }
    }
}
