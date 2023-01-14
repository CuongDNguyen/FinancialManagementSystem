package com.cuong.financialmanagementsystem.model;

import java.util.ArrayList;

public class YahooStock {
    public QuoteSummary quoteSummary;
}

class CurrentPrice{
    public double raw;
    public String fmt;
}

class CurrentRatio{
    public double raw;
    public String fmt;
}

class DebtToEquity{
    public double raw;
    public String fmt;
}

class EarningsGrowth{
    public double raw;
    public String fmt;
}

class Ebitda{
    public long raw;
    public String fmt;
    public String longFmt;
}

class EbitdaMargins{
    public double raw;
    public String fmt;
}

class FinancialData{
    public int maxAge;
    public CurrentPrice currentPrice;
    public TargetHighPrice targetHighPrice;
    public TargetLowPrice targetLowPrice;
    public TargetMeanPrice targetMeanPrice;
    public TargetMedianPrice targetMedianPrice;
    public RecommendationMean recommendationMean;
    public String recommendationKey;
    public NumberOfAnalystOpinions numberOfAnalystOpinions;
    public TotalCash totalCash;
    public TotalCashPerShare totalCashPerShare;
    public Ebitda ebitda;
    public TotalDebt totalDebt;
    public QuickRatio quickRatio;
    public CurrentRatio currentRatio;
    public TotalRevenue totalRevenue;
    public DebtToEquity debtToEquity;
    public RevenuePerShare revenuePerShare;
    public ReturnOnAssets returnOnAssets;
    public ReturnOnEquity returnOnEquity;
    public GrossProfits grossProfits;
    public FreeCashflow freeCashflow;
    public OperatingCashflow operatingCashflow;
    public EarningsGrowth earningsGrowth;
    public RevenueGrowth revenueGrowth;
    public GrossMargins grossMargins;
    public EbitdaMargins ebitdaMargins;
    public OperatingMargins operatingMargins;
    public ProfitMargins profitMargins;
    public String financialCurrency;
}

class FreeCashflow{
    public long raw;
    public String fmt;
    public String longFmt;
}

class GrossMargins{
    public double raw;
    public String fmt;
}

class GrossProfits{
    public long raw;
    public String fmt;
    public String longFmt;
}

class NumberOfAnalystOpinions{
    public int raw;
    public String fmt;
    public String longFmt;
}

class OperatingCashflow{
    public long raw;
    public String fmt;
    public String longFmt;
}

class OperatingMargins{
    public double raw;
    public String fmt;
}

class ProfitMargins{
    public double raw;
    public String fmt;
}

class QuickRatio{
    public double raw;
    public String fmt;
}

class QuoteSummary{
    public ArrayList<Result> result;
    public Object error;
}

class RecommendationMean{
    public double raw;
    public String fmt;
}

class Result{
    public FinancialData financialData;
}

class ReturnOnAssets{
    public double raw;
    public String fmt;
}

class ReturnOnEquity{
    public double raw;
    public String fmt;
}

class RevenueGrowth{
    public double raw;
    public String fmt;
}

class RevenuePerShare{
    public double raw;
    public String fmt;
}

class TargetHighPrice{
    public double raw;
    public String fmt;
}

class TargetLowPrice{
    public double raw;
    public String fmt;
}

class TargetMeanPrice{
    public double raw;
    public String fmt;
}

class TargetMedianPrice{
    public double raw;
    public String fmt;
}

class TotalCash{
    public long raw;
    public String fmt;
    public String longFmt;
}

class TotalCashPerShare{
    public double raw;
    public String fmt;
}

class TotalDebt{
    public long raw;
    public String fmt;
    public String longFmt;
}

class TotalRevenue{
    public long raw;
    public String fmt;
    public String longFmt;
}

