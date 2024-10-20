package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bv")
public final class class71 implements Runnable {

    @ObfuscatedName("bv.i")
    public OutputStream field1299;

    @ObfuscatedName("bv.b")
    public InputStream field1300;

    @ObfuscatedName("bv.r")
    public Socket field1304;

    @ObfuscatedName("bv.l")
    public boolean field1297 = false;

    @ObfuscatedName("bv.s")
    public class75 field1298;

    @ObfuscatedName("bv.d")
    public class80 field1296;

    @ObfuscatedName("bv.e")
    public byte[] field1301;

    @ObfuscatedName("bv.u")
    public int field1294 = 0;

    @ObfuscatedName("bv.q")
    public int field1302 = 0;

    @ObfuscatedName("bv.o")
    public boolean field1303 = false;

    public class71(Socket arg0, class75 arg1) throws IOException {
        this.field1298 = arg1;
        this.field1304 = arg0;
        this.field1304.setSoTimeout(30000);
        this.field1304.setTcpNoDelay(true);
        this.field1300 = this.field1304.getInputStream();
        this.field1299 = this.field1304.getOutputStream();
    }

    @ObfuscatedName("bv.s(I)V")
    public void method1371() {
        if (this.field1297) {
            return;
        }
        synchronized (this) {
            this.field1297 = true;
            this.notifyAll();
        }
        if (this.field1296 != null) {
            while (this.field1296.field1430 == 0) {
                class127.method1642(1L);
            }
            if (this.field1296.field1430 == 1) {
                try {
                    ((Thread) this.field1296.field1429).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1296 = null;
    }

    public void finalize() {
        this.method1371();
    }

    @ObfuscatedName("bv.d(B)I")
    public int method1376() throws IOException {
        return this.field1297 ? 0 : this.field1300.read();
    }

    @ObfuscatedName("bv.e(I)I")
    public int method1373() throws IOException {
        return this.field1297 ? 0 : this.field1300.available();
    }

    @ObfuscatedName("bv.u([BIII)V")
    public void method1374(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1297) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1300.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bv.q([BIII)V")
    public void method1372(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1297) {
            return;
        }
        if (this.field1303) {
            this.field1303 = false;
            throw new IOException();
        }
        if (this.field1301 == null) {
            this.field1301 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1301[this.field1302] = arg0[arg1 + var5];
                this.field1302 = (this.field1302 + 1) % 5000;
                if ((this.field1294 + 4900) % 5000 == this.field1302) {
                    throw new IOException();
                }
            }
            if (this.field1296 == null) {
                this.field1296 = this.field1298.method1495(this, 3);
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
                        if (this.field1302 == this.field1294) {
                            if (this.field1297) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1294;
                        if (this.field1302 >= this.field1294) {
                            var4 = this.field1302 - this.field1294;
                        } else {
                            var4 = 5000 - this.field1294;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1299.write(this.field1301, var3, var4);
                    } catch (IOException var12) {
                        this.field1303 = true;
                    }
                    this.field1294 = (this.field1294 + var4) % 5000;
                    try {
                        if (this.field1302 == this.field1294) {
                            this.field1299.flush();
                        }
                    } catch (IOException var11) {
                        this.field1303 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1300 != null) {
                        this.field1300.close();
                    }
                    if (this.field1299 != null) {
                        this.field1299.close();
                    }
                    if (this.field1304 != null) {
                        this.field1304.close();
                    }
                } catch (IOException var10) {
                }
                this.field1301 = null;
                break;
            }
        } catch (Exception var15) {
            class81.method3159((String) null, var15);
        }
    }
}
