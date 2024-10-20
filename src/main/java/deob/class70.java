package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("by")
public final class class70 implements Runnable {

    @ObfuscatedName("by.t")
    public InputStream field1323;

    @ObfuscatedName("by.l")
    public OutputStream field1314;

    @ObfuscatedName("by.c")
    public Socket field1315;

    @ObfuscatedName("by.d")
    public boolean field1316 = false;

    @ObfuscatedName("by.b")
    public class74 field1328;

    @ObfuscatedName("by.i")
    public class79 field1318;

    @ObfuscatedName("by.p")
    public byte[] field1319;

    @ObfuscatedName("by.y")
    public int field1313 = 0;

    @ObfuscatedName("by.u")
    public int field1321 = 0;

    @ObfuscatedName("by.z")
    public boolean field1322 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1328 = arg1;
        this.field1315 = arg0;
        this.field1315.setSoTimeout(30000);
        this.field1315.setTcpNoDelay(true);
        this.field1323 = this.field1315.getInputStream();
        this.field1314 = this.field1315.getOutputStream();
    }

    @ObfuscatedName("by.c(I)V")
    public void method1394() {
        if (this.field1316) {
            return;
        }
        synchronized (this) {
            this.field1316 = true;
            this.notifyAll();
        }
        if (this.field1318 != null) {
            while (this.field1318.field1446 == 0) {
                class126.method3086(1L);
            }
            if (this.field1318.field1446 == 1) {
                try {
                    ((Thread) this.field1318.field1442).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1318 = null;
    }

    public void finalize() {
        this.method1394();
    }

    @ObfuscatedName("by.d(I)I")
    public int method1398() throws IOException {
        return this.field1316 ? 0 : this.field1323.read();
    }

    @ObfuscatedName("by.b(I)I")
    public int method1395() throws IOException {
        return this.field1316 ? 0 : this.field1323.available();
    }

    @ObfuscatedName("by.i([BIII)V")
    public void method1396(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1316) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1323.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("by.p([BIII)V")
    public void method1397(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1316) {
            return;
        }
        if (this.field1322) {
            this.field1322 = false;
            throw new IOException();
        }
        if (this.field1319 == null) {
            this.field1319 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1319[this.field1321] = arg0[arg1 + var5];
                this.field1321 = (this.field1321 + 1) % 5000;
                if ((this.field1313 + 4900) % 5000 == this.field1321) {
                    throw new IOException();
                }
            }
            if (this.field1318 == null) {
                this.field1318 = this.field1328.method1515(this, 3);
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
                        if (this.field1321 == this.field1313) {
                            if (this.field1316) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1313;
                        if (this.field1321 >= this.field1313) {
                            var4 = this.field1321 - this.field1313;
                        } else {
                            var4 = 5000 - this.field1313;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1314.write(this.field1319, var3, var4);
                    } catch (IOException var12) {
                        this.field1322 = true;
                    }
                    this.field1313 = (this.field1313 + var4) % 5000;
                    try {
                        if (this.field1321 == this.field1313) {
                            this.field1314.flush();
                        }
                    } catch (IOException var11) {
                        this.field1322 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1323 != null) {
                        this.field1323.close();
                    }
                    if (this.field1314 != null) {
                        this.field1314.close();
                    }
                    if (this.field1315 != null) {
                        this.field1315.close();
                    }
                } catch (IOException var10) {
                }
                this.field1319 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method3170((String) null, var15);
        }
    }
}
