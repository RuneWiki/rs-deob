package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bg")
public final class class69 implements Runnable {

    @ObfuscatedName("bg.z")
    public InputStream field1294;

    @ObfuscatedName("bg.h")
    public OutputStream field1280;

    @ObfuscatedName("bg.c")
    public Socket field1281;

    @ObfuscatedName("bg.p")
    public boolean field1282 = false;

    @ObfuscatedName("bg.i")
    public class73 field1286;

    @ObfuscatedName("bg.v")
    public class78 field1287;

    @ObfuscatedName("bg.l")
    public byte[] field1283;

    @ObfuscatedName("bg.m")
    public int field1279 = 0;

    @ObfuscatedName("bg.g")
    public int field1297 = 0;

    @ObfuscatedName("bg.t")
    public boolean field1285 = false;

    public class69(Socket arg0, class73 arg1) throws IOException {
        this.field1286 = arg1;
        this.field1281 = arg0;
        this.field1281.setSoTimeout(30000);
        this.field1281.setTcpNoDelay(true);
        this.field1294 = this.field1281.getInputStream();
        this.field1280 = this.field1281.getOutputStream();
    }

    @ObfuscatedName("bg.l(I)V")
    public void method1359() {
        if (this.field1282) {
            return;
        }
        synchronized (this) {
            this.field1282 = true;
            this.notifyAll();
        }
        if (this.field1287 != null) {
            while (this.field1287.field1408 == 0) {
                class125.method2379(1L);
            }
            if (this.field1287.field1408 == 1) {
                try {
                    ((Thread) this.field1287.field1411).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1287 = null;
    }

    public void finalize() {
        this.method1359();
    }

    @ObfuscatedName("bg.m(B)I")
    public int method1369() throws IOException {
        return this.field1282 ? 0 : this.field1294.read();
    }

    @ObfuscatedName("bg.g(I)I")
    public int method1360() throws IOException {
        return this.field1282 ? 0 : this.field1294.available();
    }

    @ObfuscatedName("bg.t([BIII)V")
    public void method1374(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1282) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1294.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bg.o([BIII)V")
    public void method1363(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1282) {
            return;
        }
        if (this.field1285) {
            this.field1285 = false;
            throw new IOException();
        }
        if (this.field1283 == null) {
            this.field1283 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1283[this.field1297] = arg0[arg1 + var5];
                this.field1297 = (this.field1297 + 1) % 5000;
                if ((this.field1279 + 4900) % 5000 == this.field1297) {
                    throw new IOException();
                }
            }
            if (this.field1287 == null) {
                this.field1287 = this.field1286.method1475(this, 3);
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
                        if (this.field1297 == this.field1279) {
                            if (this.field1282) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1279;
                        if (this.field1297 >= this.field1279) {
                            var4 = this.field1297 - this.field1279;
                        } else {
                            var4 = 5000 - this.field1279;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1280.write(this.field1283, var3, var4);
                    } catch (IOException var12) {
                        this.field1285 = true;
                    }
                    this.field1279 = (this.field1279 + var4) % 5000;
                    try {
                        if (this.field1297 == this.field1279) {
                            this.field1280.flush();
                        }
                    } catch (IOException var11) {
                        this.field1285 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1294 != null) {
                        this.field1294.close();
                    }
                    if (this.field1280 != null) {
                        this.field1280.close();
                    }
                    if (this.field1281 != null) {
                        this.field1281.close();
                    }
                } catch (IOException var10) {
                }
                this.field1283 = null;
                break;
            }
        } catch (Exception var15) {
            class79.method218((String) null, var15);
        }
    }
}
