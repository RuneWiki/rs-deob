package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bz")
public final class class71 implements Runnable {

    @ObfuscatedName("bz.e")
    public InputStream field1304;

    @ObfuscatedName("bz.i")
    public OutputStream field1296;

    @ObfuscatedName("bz.k")
    public Socket field1301;

    @ObfuscatedName("bz.q")
    public boolean field1295 = false;

    @ObfuscatedName("bz.j")
    public class75 field1299;

    @ObfuscatedName("bz.z")
    public class80 field1297;

    @ObfuscatedName("bz.m")
    public byte[] field1300;

    @ObfuscatedName("bz.w")
    public int field1302 = 0;

    @ObfuscatedName("bz.a")
    public int field1303 = 0;

    @ObfuscatedName("bz.d")
    public boolean field1298 = false;

    public class71(Socket arg0, class75 arg1) throws IOException {
        this.field1299 = arg1;
        this.field1301 = arg0;
        this.field1301.setSoTimeout(30000);
        this.field1301.setTcpNoDelay(true);
        this.field1304 = this.field1301.getInputStream();
        this.field1296 = this.field1301.getOutputStream();
    }

    @ObfuscatedName("bz.q(I)V")
    public void method1434() {
        if (this.field1295) {
            return;
        }
        synchronized (this) {
            this.field1295 = true;
            this.notifyAll();
        }
        if (this.field1297 != null) {
            while (this.field1297.field1413 == 0) {
                class127.method2200(1L);
            }
            if (this.field1297.field1413 == 1) {
                try {
                    ((Thread) this.field1297.field1417).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1297 = null;
    }

    public void finalize() {
        this.method1434();
    }

    @ObfuscatedName("bz.j(I)I")
    public int method1436() throws IOException {
        return this.field1295 ? 0 : this.field1304.read();
    }

    @ObfuscatedName("bz.z(B)I")
    public int method1435() throws IOException {
        return this.field1295 ? 0 : this.field1304.available();
    }

    @ObfuscatedName("bz.m([BIIB)V")
    public void method1453(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1295) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1304.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bz.w([BIIB)V")
    public void method1437(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1295) {
            return;
        }
        if (this.field1298) {
            this.field1298 = false;
            throw new IOException();
        }
        if (this.field1300 == null) {
            this.field1300 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1300[this.field1303] = arg0[arg1 + var5];
                this.field1303 = (this.field1303 + 1) % 5000;
                if ((this.field1302 + 4900) % 5000 == this.field1303) {
                    throw new IOException();
                }
            }
            if (this.field1297 == null) {
                this.field1297 = this.field1299.method1546(this, 3);
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
                        if (this.field1303 == this.field1302) {
                            if (this.field1295) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1302;
                        if (this.field1303 >= this.field1302) {
                            var4 = this.field1303 - this.field1302;
                        } else {
                            var4 = 5000 - this.field1302;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1296.write(this.field1300, var3, var4);
                    } catch (IOException var12) {
                        this.field1298 = true;
                    }
                    this.field1302 = (this.field1302 + var4) % 5000;
                    try {
                        if (this.field1303 == this.field1302) {
                            this.field1296.flush();
                        }
                    } catch (IOException var11) {
                        this.field1298 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1304 != null) {
                        this.field1304.close();
                    }
                    if (this.field1296 != null) {
                        this.field1296.close();
                    }
                    if (this.field1301 != null) {
                        this.field1301.close();
                    }
                } catch (IOException var10) {
                }
                this.field1300 = null;
                break;
            }
        } catch (Exception var15) {
            class81.method1452((String) null, var15);
        }
    }
}
