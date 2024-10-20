package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bk")
public final class class70 implements Runnable {

    @ObfuscatedName("bk.c")
    public InputStream field1298;

    @ObfuscatedName("bk.q")
    public OutputStream field1296;

    @ObfuscatedName("bk.y")
    public Socket field1294;

    @ObfuscatedName("bk.v")
    public boolean field1295 = false;

    @ObfuscatedName("bk.g")
    public class74 field1304;

    @ObfuscatedName("bk.x")
    public class79 field1297;

    @ObfuscatedName("bk.u")
    public byte[] field1305;

    @ObfuscatedName("bk.l")
    public int field1299 = 0;

    @ObfuscatedName("bk.a")
    public int field1300 = 0;

    @ObfuscatedName("bk.h")
    public boolean field1301 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1304 = arg1;
        this.field1294 = arg0;
        this.field1294.setSoTimeout(30000);
        this.field1294.setTcpNoDelay(true);
        this.field1298 = this.field1294.getInputStream();
        this.field1296 = this.field1294.getOutputStream();
    }

    @ObfuscatedName("bk.q(B)V")
    public void method1330() {
        if (this.field1295) {
            return;
        }
        synchronized (this) {
            this.field1295 = true;
            this.notifyAll();
        }
        if (this.field1297 != null) {
            while (this.field1297.field1423 == 0) {
                class126.method577(1L);
            }
            if (this.field1297.field1423 == 1) {
                try {
                    ((Thread) this.field1297.field1427).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1297 = null;
    }

    public void finalize() {
        this.method1330();
    }

    @ObfuscatedName("bk.y(B)I")
    public int method1331() throws IOException {
        return this.field1295 ? 0 : this.field1298.read();
    }

    @ObfuscatedName("bk.v(I)I")
    public int method1332() throws IOException {
        return this.field1295 ? 0 : this.field1298.available();
    }

    @ObfuscatedName("bk.g([BIII)V")
    public void method1340(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1295) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1298.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bk.x([BIII)V")
    public void method1347(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1295) {
            return;
        }
        if (this.field1301) {
            this.field1301 = false;
            throw new IOException();
        }
        if (this.field1305 == null) {
            this.field1305 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1305[this.field1300] = arg0[arg1 + var5];
                this.field1300 = (this.field1300 + 1) % 5000;
                if ((this.field1299 + 4900) % 5000 == this.field1300) {
                    throw new IOException();
                }
            }
            if (this.field1297 == null) {
                this.field1297 = this.field1304.method1433(this, 3);
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
                        if (this.field1300 == this.field1299) {
                            if (this.field1295) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1299;
                        if (this.field1300 >= this.field1299) {
                            var4 = this.field1300 - this.field1299;
                        } else {
                            var4 = 5000 - this.field1299;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1296.write(this.field1305, var3, var4);
                    } catch (IOException var12) {
                        this.field1301 = true;
                    }
                    this.field1299 = (this.field1299 + var4) % 5000;
                    try {
                        if (this.field1300 == this.field1299) {
                            this.field1296.flush();
                        }
                    } catch (IOException var11) {
                        this.field1301 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1298 != null) {
                        this.field1298.close();
                    }
                    if (this.field1296 != null) {
                        this.field1296.close();
                    }
                    if (this.field1294 != null) {
                        this.field1294.close();
                    }
                } catch (IOException var10) {
                }
                this.field1305 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method789((String) null, var15);
        }
    }
}
