package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("br")
public final class class70 implements Runnable {

    @ObfuscatedName("br.d")
    public InputStream field1280;

    @ObfuscatedName("br.g")
    public OutputStream field1279;

    @ObfuscatedName("br.a")
    public Socket field1278;

    @ObfuscatedName("br.t")
    public boolean field1281 = false;

    @ObfuscatedName("br.f")
    public class74 field1283;

    @ObfuscatedName("br.c")
    public class79 field1284;

    @ObfuscatedName("br.p")
    public byte[] field1288;

    @ObfuscatedName("br.s")
    public int field1285 = 0;

    @ObfuscatedName("br.k")
    public int field1286 = 0;

    @ObfuscatedName("br.m")
    public boolean field1287 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1283 = arg1;
        this.field1278 = arg0;
        this.field1278.setSoTimeout(30000);
        this.field1278.setTcpNoDelay(true);
        this.field1280 = this.field1278.getInputStream();
        this.field1279 = this.field1278.getOutputStream();
    }

    @ObfuscatedName("br.a(I)V")
    public void method1356() {
        if (this.field1281) {
            return;
        }
        synchronized (this) {
            this.field1281 = true;
            this.notifyAll();
        }
        if (this.field1284 != null) {
            while (this.field1284.field1412 == 0) {
                class126.method112(1L);
            }
            if (this.field1284.field1412 == 1) {
                try {
                    ((Thread) this.field1284.field1416).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1284 = null;
    }

    public void finalize() {
        this.method1356();
    }

    @ObfuscatedName("br.t(I)I")
    public int method1358() throws IOException {
        return this.field1281 ? 0 : this.field1280.read();
    }

    @ObfuscatedName("br.f(I)I")
    public int method1359() throws IOException {
        return this.field1281 ? 0 : this.field1280.available();
    }

    @ObfuscatedName("br.c([BIIB)V")
    public void method1360(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1281) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1280.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("br.p([BIIB)V")
    public void method1361(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1281) {
            return;
        }
        if (this.field1287) {
            this.field1287 = false;
            throw new IOException();
        }
        if (this.field1288 == null) {
            this.field1288 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1288[this.field1286] = arg0[arg1 + var5];
                this.field1286 = (this.field1286 + 1) % 5000;
                if ((this.field1285 + 4900) % 5000 == this.field1286) {
                    throw new IOException();
                }
            }
            if (this.field1284 == null) {
                this.field1284 = this.field1283.method1460(this, 3);
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
                        if (this.field1286 == this.field1285) {
                            if (this.field1281) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1285;
                        if (this.field1286 >= this.field1285) {
                            var4 = this.field1286 - this.field1285;
                        } else {
                            var4 = 5000 - this.field1285;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1279.write(this.field1288, var3, var4);
                    } catch (IOException var12) {
                        this.field1287 = true;
                    }
                    this.field1285 = (this.field1285 + var4) % 5000;
                    try {
                        if (this.field1286 == this.field1285) {
                            this.field1279.flush();
                        }
                    } catch (IOException var11) {
                        this.field1287 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1280 != null) {
                        this.field1280.close();
                    }
                    if (this.field1279 != null) {
                        this.field1279.close();
                    }
                    if (this.field1278 != null) {
                        this.field1278.close();
                    }
                } catch (IOException var10) {
                }
                this.field1288 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method2305((String) null, var15);
        }
    }
}
