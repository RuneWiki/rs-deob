package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bi")
public final class class70 implements Runnable {

    @ObfuscatedName("bi.b")
    public InputStream field1315;

    @ObfuscatedName("bi.c")
    public OutputStream field1303;

    @ObfuscatedName("bi.j")
    public Socket field1306;

    @ObfuscatedName("bi.i")
    public boolean field1305 = false;

    @ObfuscatedName("bi.k")
    public class74 field1309;

    @ObfuscatedName("bi.q")
    public class79 field1307;

    @ObfuscatedName("bi.t")
    public byte[] field1304;

    @ObfuscatedName("bi.v")
    public int field1308 = 0;

    @ObfuscatedName("bi.y")
    public int field1310 = 0;

    @ObfuscatedName("bi.w")
    public boolean field1311 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1309 = arg1;
        this.field1306 = arg0;
        this.field1306.setSoTimeout(30000);
        this.field1306.setTcpNoDelay(true);
        this.field1315 = this.field1306.getInputStream();
        this.field1303 = this.field1306.getOutputStream();
    }

    @ObfuscatedName("bi.i(I)V")
    public void method1350() {
        if (this.field1305) {
            return;
        }
        synchronized (this) {
            this.field1305 = true;
            this.notifyAll();
        }
        if (this.field1307 != null) {
            while (this.field1307.field1433 == 0) {
                class126.method874(1L);
            }
            if (this.field1307.field1433 == 1) {
                try {
                    ((Thread) this.field1307.field1435).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1307 = null;
    }

    public void finalize() {
        this.method1350();
    }

    @ObfuscatedName("bi.k(I)I")
    public int method1349() throws IOException {
        return this.field1305 ? 0 : this.field1315.read();
    }

    @ObfuscatedName("bi.q(I)I")
    public int method1362() throws IOException {
        return this.field1305 ? 0 : this.field1315.available();
    }

    @ObfuscatedName("bi.t([BIII)V")
    public void method1351(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1305) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1315.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bi.v([BIII)V")
    public void method1352(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1305) {
            return;
        }
        if (this.field1311) {
            this.field1311 = false;
            throw new IOException();
        }
        if (this.field1304 == null) {
            this.field1304 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1304[this.field1310] = arg0[arg1 + var5];
                this.field1310 = (this.field1310 + 1) % 5000;
                if ((this.field1308 + 4900) % 5000 == this.field1310) {
                    throw new IOException();
                }
            }
            if (this.field1307 == null) {
                this.field1307 = this.field1309.method1463(this, 3);
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
                        if (this.field1310 == this.field1308) {
                            if (this.field1305) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1308;
                        if (this.field1310 >= this.field1308) {
                            var4 = this.field1310 - this.field1308;
                        } else {
                            var4 = 5000 - this.field1308;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1303.write(this.field1304, var3, var4);
                    } catch (IOException var12) {
                        this.field1311 = true;
                    }
                    this.field1308 = (this.field1308 + var4) % 5000;
                    try {
                        if (this.field1310 == this.field1308) {
                            this.field1303.flush();
                        }
                    } catch (IOException var11) {
                        this.field1311 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1315 != null) {
                        this.field1315.close();
                    }
                    if (this.field1303 != null) {
                        this.field1303.close();
                    }
                    if (this.field1306 != null) {
                        this.field1306.close();
                    }
                } catch (IOException var10) {
                }
                this.field1304 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method173((String) null, var15);
        }
    }
}
