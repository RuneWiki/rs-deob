package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bs")
public final class class70 implements Runnable {

    @ObfuscatedName("bs.i")
    public OutputStream field1285;

    @ObfuscatedName("bs.p")
    public InputStream field1297;

    @ObfuscatedName("bs.a")
    public Socket field1286;

    @ObfuscatedName("bs.l")
    public boolean field1287 = false;

    @ObfuscatedName("bs.q")
    public class74 field1298;

    @ObfuscatedName("bs.b")
    public class79 field1284;

    @ObfuscatedName("bs.u")
    public byte[] field1290;

    @ObfuscatedName("bs.d")
    public int field1291 = 0;

    @ObfuscatedName("bs.m")
    public int field1292 = 0;

    @ObfuscatedName("bs.v")
    public boolean field1294 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1298 = arg1;
        this.field1286 = arg0;
        this.field1286.setSoTimeout(30000);
        this.field1286.setTcpNoDelay(true);
        this.field1297 = this.field1286.getInputStream();
        this.field1285 = this.field1286.getOutputStream();
    }

    @ObfuscatedName("bs.a(B)V")
    public void method1332() {
        if (this.field1287) {
            return;
        }
        synchronized (this) {
            this.field1287 = true;
            this.notifyAll();
        }
        if (this.field1284 != null) {
            while (this.field1284.field1428 == 0) {
                class126.method1489(1L);
            }
            if (this.field1284.field1428 == 1) {
                try {
                    ((Thread) this.field1284.field1432).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1284 = null;
    }

    public void finalize() {
        this.method1332();
    }

    @ObfuscatedName("bs.l(I)I")
    public int method1334() throws IOException {
        return this.field1287 ? 0 : this.field1297.read();
    }

    @ObfuscatedName("bs.q(I)I")
    public int method1335() throws IOException {
        return this.field1287 ? 0 : this.field1297.available();
    }

    @ObfuscatedName("bs.b([BIII)V")
    public void method1355(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1287) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1297.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bs.u([BIII)V")
    public void method1350(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1287) {
            return;
        }
        if (this.field1294) {
            this.field1294 = false;
            throw new IOException();
        }
        if (this.field1290 == null) {
            this.field1290 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1290[this.field1292] = arg0[arg1 + var5];
                this.field1292 = (this.field1292 + 1) % 5000;
                if ((this.field1291 + 4900) % 5000 == this.field1292) {
                    throw new IOException();
                }
            }
            if (this.field1284 == null) {
                this.field1284 = this.field1298.method1455(this, 3);
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
                        if (this.field1292 == this.field1291) {
                            if (this.field1287) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1291;
                        if (this.field1292 >= this.field1291) {
                            var4 = this.field1292 - this.field1291;
                        } else {
                            var4 = 5000 - this.field1291;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1285.write(this.field1290, var3, var4);
                    } catch (IOException var12) {
                        this.field1294 = true;
                    }
                    this.field1291 = (this.field1291 + var4) % 5000;
                    try {
                        if (this.field1292 == this.field1291) {
                            this.field1285.flush();
                        }
                    } catch (IOException var11) {
                        this.field1294 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1297 != null) {
                        this.field1297.close();
                    }
                    if (this.field1285 != null) {
                        this.field1285.close();
                    }
                    if (this.field1286 != null) {
                        this.field1286.close();
                    }
                } catch (IOException var10) {
                }
                this.field1290 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method252((String) null, var15);
        }
    }
}
