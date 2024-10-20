package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bo")
public final class class70 implements Runnable {

    @ObfuscatedName("bo.q")
    public InputStream field1284;

    @ObfuscatedName("bo.c")
    public OutputStream field1282;

    @ObfuscatedName("bo.p")
    public Socket field1281;

    @ObfuscatedName("bo.z")
    public boolean field1290 = false;

    @ObfuscatedName("bo.m")
    public class74 field1283;

    @ObfuscatedName("bo.k")
    public class79 field1280;

    @ObfuscatedName("bo.v")
    public byte[] field1292;

    @ObfuscatedName("bo.y")
    public int field1286 = 0;

    @ObfuscatedName("bo.d")
    public int field1287 = 0;

    @ObfuscatedName("bo.l")
    public boolean field1288 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1283 = arg1;
        this.field1281 = arg0;
        this.field1281.setSoTimeout(30000);
        this.field1281.setTcpNoDelay(true);
        this.field1284 = this.field1281.getInputStream();
        this.field1282 = this.field1281.getOutputStream();
    }

    @ObfuscatedName("bo.m(B)V")
    public void method1400() {
        if (this.field1290) {
            return;
        }
        synchronized (this) {
            this.field1290 = true;
            this.notifyAll();
        }
        if (this.field1280 != null) {
            while (this.field1280.field1417 == 0) {
                class126.method210(1L);
            }
            if (this.field1280.field1417 == 1) {
                try {
                    ((Thread) this.field1280.field1419).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1280 = null;
    }

    public void finalize() {
        this.method1400();
    }

    @ObfuscatedName("bo.k(I)I")
    public int method1401() throws IOException {
        return this.field1290 ? 0 : this.field1284.read();
    }

    @ObfuscatedName("bo.v(I)I")
    public int method1399() throws IOException {
        return this.field1290 ? 0 : this.field1284.available();
    }

    @ObfuscatedName("bo.y([BIII)V")
    public void method1416(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1290) {
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

    @ObfuscatedName("bo.d([BIII)V")
    public void method1403(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1290) {
            return;
        }
        if (this.field1288) {
            this.field1288 = false;
            throw new IOException();
        }
        if (this.field1292 == null) {
            this.field1292 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1292[this.field1287] = arg0[arg1 + var5];
                this.field1287 = (this.field1287 + 1) % 5000;
                if ((this.field1286 + 4900) % 5000 == this.field1287) {
                    throw new IOException();
                }
            }
            if (this.field1280 == null) {
                this.field1280 = this.field1283.method1512(this, 3);
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
                        if (this.field1287 == this.field1286) {
                            if (this.field1290) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1286;
                        if (this.field1287 >= this.field1286) {
                            var4 = this.field1287 - this.field1286;
                        } else {
                            var4 = 5000 - this.field1286;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1282.write(this.field1292, var3, var4);
                    } catch (IOException var12) {
                        this.field1288 = true;
                    }
                    this.field1286 = (this.field1286 + var4) % 5000;
                    try {
                        if (this.field1287 == this.field1286) {
                            this.field1282.flush();
                        }
                    } catch (IOException var11) {
                        this.field1288 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1284 != null) {
                        this.field1284.close();
                    }
                    if (this.field1282 != null) {
                        this.field1282.close();
                    }
                    if (this.field1281 != null) {
                        this.field1281.close();
                    }
                } catch (IOException var10) {
                }
                this.field1292 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method2321((String) null, var15);
        }
    }
}
