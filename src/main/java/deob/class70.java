package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bp")
public final class class70 implements Runnable {

    @ObfuscatedName("bp.j")
    public InputStream field1301;

    @ObfuscatedName("bp.f")
    public OutputStream field1304;

    @ObfuscatedName("bp.o")
    public Socket field1293;

    @ObfuscatedName("bp.h")
    public boolean field1294 = false;

    @ObfuscatedName("bp.u")
    public class74 field1295;

    @ObfuscatedName("bp.a")
    public class79 field1296;

    @ObfuscatedName("bp.q")
    public byte[] field1291;

    @ObfuscatedName("bp.t")
    public int field1306 = 0;

    @ObfuscatedName("bp.n")
    public int field1299 = 0;

    @ObfuscatedName("bp.i")
    public boolean field1302 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1295 = arg1;
        this.field1293 = arg0;
        this.field1293.setSoTimeout(30000);
        this.field1293.setTcpNoDelay(true);
        this.field1301 = this.field1293.getInputStream();
        this.field1304 = this.field1293.getOutputStream();
    }

    @ObfuscatedName("bp.o(S)V")
    public void method1381() {
        if (this.field1294) {
            return;
        }
        synchronized (this) {
            this.field1294 = true;
            this.notifyAll();
        }
        if (this.field1296 != null) {
            while (this.field1296.field1419 == 0) {
                class126.method768(1L);
            }
            if (this.field1296.field1419 == 1) {
                try {
                    ((Thread) this.field1296.field1416).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1296 = null;
    }

    public void finalize() {
        this.method1381();
    }

    @ObfuscatedName("bp.h(B)I")
    public int method1383() throws IOException {
        return this.field1294 ? 0 : this.field1301.read();
    }

    @ObfuscatedName("bp.u(I)I")
    public int method1384() throws IOException {
        return this.field1294 ? 0 : this.field1301.available();
    }

    @ObfuscatedName("bp.a([BIIB)V")
    public void method1400(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1294) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1301.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bp.q([BIII)V")
    public void method1385(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1294) {
            return;
        }
        if (this.field1302) {
            this.field1302 = false;
            throw new IOException();
        }
        if (this.field1291 == null) {
            this.field1291 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1291[this.field1299] = arg0[arg1 + var5];
                this.field1299 = (this.field1299 + 1) % 5000;
                if ((this.field1306 + 4900) % 5000 == this.field1299) {
                    throw new IOException();
                }
            }
            if (this.field1296 == null) {
                this.field1296 = this.field1295.method1512(this, 3);
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
                        if (this.field1306 == this.field1299) {
                            if (this.field1294) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1306;
                        if (this.field1299 >= this.field1306) {
                            var4 = this.field1299 - this.field1306;
                        } else {
                            var4 = 5000 - this.field1306;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1304.write(this.field1291, var3, var4);
                    } catch (IOException var12) {
                        this.field1302 = true;
                    }
                    this.field1306 = (this.field1306 + var4) % 5000;
                    try {
                        if (this.field1306 == this.field1299) {
                            this.field1304.flush();
                        }
                    } catch (IOException var11) {
                        this.field1302 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1301 != null) {
                        this.field1301.close();
                    }
                    if (this.field1304 != null) {
                        this.field1304.close();
                    }
                    if (this.field1293 != null) {
                        this.field1293.close();
                    }
                } catch (IOException var10) {
                }
                this.field1291 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method1544((String) null, var15);
        }
    }
}
