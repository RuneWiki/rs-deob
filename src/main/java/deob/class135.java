package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eo")
public final class class135 implements Runnable {

    @ObfuscatedName("eo.y")
    public InputStream field2112;

    @ObfuscatedName("eo.k")
    public OutputStream field2100;

    @ObfuscatedName("eo.g")
    public Socket field2099;

    @ObfuscatedName("eo.n")
    public boolean field2102 = false;

    @ObfuscatedName("eo.t")
    public class128 field2110;

    @ObfuscatedName("eo.e")
    public class138 field2111;

    @ObfuscatedName("eo.q")
    public byte[] field2103;

    @ObfuscatedName("eo.z")
    public int field2106 = 0;

    @ObfuscatedName("eo.v")
    public int field2107 = 0;

    @ObfuscatedName("eo.b")
    public boolean field2108 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2110 = arg1;
        this.field2099 = arg0;
        this.field2099.setSoTimeout(30000);
        this.field2099.setTcpNoDelay(true);
        this.field2112 = this.field2099.getInputStream();
        this.field2100 = this.field2099.getOutputStream();
    }

    @ObfuscatedName("eo.g(S)V")
    public void method2640() {
        if (this.field2102) {
            return;
        }
        synchronized (this) {
            this.field2102 = true;
            this.notifyAll();
        }
        if (this.field2111 != null) {
            while (this.field2111.field2138 == 0) {
                class119.method488(1L);
            }
            if (this.field2111.field2138 == 1) {
                try {
                    ((Thread) this.field2111.field2134).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2111 = null;
    }

    public void finalize() {
        this.method2640();
    }

    @ObfuscatedName("eo.n(I)I")
    public int method2655() throws IOException {
        return this.field2102 ? 0 : this.field2112.read();
    }

    @ObfuscatedName("eo.t(I)I")
    public int method2642() throws IOException {
        return this.field2102 ? 0 : this.field2112.available();
    }

    @ObfuscatedName("eo.e([BIII)V")
    public void method2643(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2102) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2112.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eo.q([BIII)V")
    public void method2649(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2102) {
            return;
        }
        if (this.field2108) {
            this.field2108 = false;
            throw new IOException();
        }
        if (this.field2103 == null) {
            this.field2103 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2103[this.field2107] = arg0[arg1 + var5];
                this.field2107 = (this.field2107 + 1) % 5000;
                if ((this.field2106 + 4900) % 5000 == this.field2107) {
                    throw new IOException();
                }
            }
            if (this.field2111 == null) {
                this.field2111 = this.field2110.method2541(this, 3);
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
                        if (this.field2107 == this.field2106) {
                            if (this.field2102) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2106;
                        if (this.field2107 >= this.field2106) {
                            var4 = this.field2107 - this.field2106;
                        } else {
                            var4 = 5000 - this.field2106;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2100.write(this.field2103, var3, var4);
                    } catch (IOException var12) {
                        this.field2108 = true;
                    }
                    this.field2106 = (this.field2106 + var4) % 5000;
                    try {
                        if (this.field2107 == this.field2106) {
                            this.field2100.flush();
                        }
                    } catch (IOException var11) {
                        this.field2108 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2112 != null) {
                        this.field2112.close();
                    }
                    if (this.field2100 != null) {
                        this.field2100.close();
                    }
                    if (this.field2099 != null) {
                        this.field2099.close();
                    }
                } catch (IOException var10) {
                }
                this.field2103 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method793((String) null, var15);
        }
    }
}
