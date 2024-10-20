package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gs")
public class class168 {

    @ObfuscatedName("gs.ap")
    public int field1789 = -1;

    @ObfuscatedName("gs.ar")
    public String field1790;

    @ObfuscatedName("gs.ak")
    public class112 field1791;

    @ObfuscatedName("gs.ax")
    public String field1792 = null;

    @ObfuscatedName("gs.as")
    public float[] field1793 = new float[4];

    @ObfuscatedName("gs.ay")
    public ArrayList field1786 = new ArrayList();

    @ObfuscatedName("gs.am")
    public ArrayList field1795 = new ArrayList();

    @ObfuscatedName("gs.az")
    public ArrayList field1796 = new ArrayList();

    @ObfuscatedName("gs.ae")
    public Map field1787 = new HashMap();

    @ObfuscatedName("gs.au")
    public Map field1798 = new HashMap();

    @ObfuscatedName("gs.aj(Ljava/lang/String;Leb;I)Z")
    public boolean method3107(String arg0, class110 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3116();
            try {
                this.field1790 = arg0;
                this.field1791 = arg1.method2663(new URL(this.field1790));
                this.field1789 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3116();
                this.field1789 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("gs.al(Leb;S)V")
    public void method3108(class110 arg0) {
        switch(this.field1789) {
            case 0:
                this.method3149(arg0);
                break;
            case 1:
                this.method3140();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("gs.ac(B)I")
    public int method3119() {
        return this.field1789;
    }

    @ObfuscatedName("gs.ab(Ljava/lang/String;I)I")
    public int method3132(String arg0) {
        return this.field1787.containsKey(arg0) ? (Integer) this.field1787.get(arg0) : -1;
    }

    @ObfuscatedName("gs.an(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3118(String arg0) {
        return (String) ((String) (this.field1798.containsKey(arg0) ? this.field1798.get(arg0) : null));
    }

    @ObfuscatedName("gs.ao(I)Ljava/util/ArrayList;")
    public ArrayList method3120() {
        return this.field1795;
    }

    @ObfuscatedName("gs.av(B)Ljava/util/ArrayList;")
    public ArrayList method3113() {
        return this.field1796;
    }

    @ObfuscatedName("gs.aq(I)Ljava/lang/String;")
    public String method3114() {
        return this.field1792;
    }

    @ObfuscatedName("gs.ap(I)[F")
    public float[] method3123() {
        return this.field1793;
    }

    @ObfuscatedName("gs.ar(B)Ljava/util/ArrayList;")
    public ArrayList method3111() {
        return this.field1786;
    }

    @ObfuscatedName("gs.ak(B)V")
    public void method3116() {
        this.field1791 = null;
        this.field1792 = null;
        this.field1793[0] = 0.0F;
        this.field1793[1] = 0.0F;
        this.field1793[2] = 1.0F;
        this.field1793[3] = 1.0F;
        this.field1786.clear();
        this.field1795.clear();
        this.field1796.clear();
        this.field1787.clear();
        this.field1798.clear();
    }

    @ObfuscatedName("gs.ax(Leb;I)V")
    public void method3149(class110 arg0) {
        if (this.field1791 == null || !this.field1791.method2693()) {
            return;
        }
        byte[] var2 = this.field1791.method2689();
        if (var2 == null) {
            this.method3116();
            this.field1789 = 100;
            return;
        }
        try {
            this.method3115(new class434(var2), arg0);
        } catch (UnsupportedEncodingException var4) {
            this.method3116();
            this.field1789 = 102;
            return;
        }
        this.field1789 = this.field1795.size() > 0 ? 1 : 2;
        this.field1791 = null;
    }

    @ObfuscatedName("gs.as(B)V")
    public void method3140() {
        Iterator var1 = this.field1795.iterator();
        class174 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1795.iterator();
                while (var3.hasNext()) {
                    class174 var4 = (class174) var3.next();
                    if (var4.field1831 != null) {
                        byte[] var5 = var4.field1831.method2689();
                        if (var5 != null && var5.length > 0) {
                            this.field1789 = 2;
                            return;
                        }
                    }
                }
                this.method3116();
                this.field1789 = 101;
                return;
            }
            var2 = (class174) var1.next();
        } while (var2.field1831 == null || var2.field1831.method2693());
    }

    @ObfuscatedName("gs.ay(Lorg/json/JSONArray;Leb;I)V")
    public void method3134(JSONArray arg0, class110 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class174 var5 = new class174(this);
                var5.field1831 = arg1.method2663(new URL(var4.getString("src")));
                var5.field1830 = method4798(var4, "placement");
                this.field1795.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("gs.am(Lorg/json/JSONArray;I)V")
    public void method3122(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class175 var4 = new class175(this);
            var4.field1837 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1838 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1835 = var10;
            var4.field1840 = var3.getInt("font");
            var4.field1841 = method4798(var3, "placement");
            this.field1796.add(var4);
        }
    }

    @ObfuscatedName("gs.az(Lorg/json/JSONObject;I)V")
    public void method3124(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1793 = method4798(arg0, "clickbounds");
        this.field1792 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1786.add(new class176(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1786.add(new class176(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1786.add(new class176(this, var2[var3], 0));
                        } else {
                            this.field1786.add(new class167(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("gs.ae(Lorg/json/JSONObject;B)V")
    public void method3131(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1787.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1787.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1787.put(var2[var3], 0);
                    } else {
                        this.field1798.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("gs.au(Lqg;Leb;B)V")
    public void method3115(class434 arg0, class110 arg1) {
        JSONObject var4;
        try {
            JSONObject var3 = arg0.method7314();
            var4 = var3.getJSONObject("message");
        } catch (Exception var14) {
            this.method3116();
            this.field1789 = 102;
            return;
        }
        try {
            this.method3134(var4.getJSONArray("images"), arg1);
        } catch (Exception var13) {
            this.field1795.clear();
        }
        try {
            this.method3122(var4.getJSONArray("labels"));
        } catch (Exception var12) {
            this.field1796.clear();
        }
        try {
            this.method3124(var4.getJSONObject("behaviour"));
        } catch (Exception var11) {
            this.field1792 = null;
            this.field1793[0] = 0.0F;
            this.field1793[1] = 0.0F;
            this.field1793[2] = 1.0F;
            this.field1793[3] = 1.0F;
            this.field1786.clear();
        }
        try {
            this.method3131(var4.getJSONObject("meta"));
        } catch (Exception var10) {
            this.field1787.clear();
            this.field1798.clear();
        }
    }

    @ObfuscatedName("gs.ag(Ljava/lang/String;Leb;B)Z")
    public boolean method3144(String arg0, class110 arg1) {
        try {
            this.method3115(new class434(arg0.getBytes()), arg1);
            this.field1789 = this.field1795.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var4) {
            this.field1789 = 102;
        }
        return this.field1789 < 100;
    }

    @ObfuscatedName("kk.at(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method4798(JSONObject arg0, String arg1) throws JSONException {
        float[] var2 = new float[4];
        try {
            JSONArray var3 = arg0.getJSONArray(arg1);
            var2[0] = (float) var3.optDouble(0, 0.0D);
            var2[1] = (float) var3.optDouble(1, 0.0D);
            var2[2] = (float) var3.optDouble(2, 1.0D);
            var2[3] = (float) var3.optDouble(3, 1.0D);
        } catch (JSONException var5) {
            var2[0] = 0.0F;
            var2[1] = 0.0F;
            var2[2] = 1.0F;
            var2[3] = 1.0F;
        }
        return var2;
    }
}
