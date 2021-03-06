## Catalog Pricing Rule

Defines how prices are modified or set for items that match the pricing rule
during the active time period.

### Structure

`CatalogPricingRule`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `String` | Optional | User-defined name for the pricing rule. For example, "Buy one get one<br>free" or "10% off". |
| `TimePeriodIds` | `List<String>` | Optional | A list of unique IDs for the catalog time periods when<br>this pricing rule is in effect. If left unset, the pricing rule is always<br>in effect. |
| `DiscountId` | `String` | Optional | Unique ID for the `CatalogDiscount` to take off<br>the price of all matched items. |
| `MatchProductsId` | `String` | Optional | Unique ID for the `CatalogProductSet` that will be matched by this rule.<br>A match rule matches within the entire cart.<br>A match rule can match multiple times in the cart.<br>If no `ProductSet` is present, the rule will match all products. |
| `ApplyProductsId` | `String` | Optional | __Deprecated__: Please use the `exclude_products_id` field to apply<br>an exclude set instead. Exclude sets allow better control over quantity<br>ranges and offer more flexibility for which matched items receive a discount.<br><br>`CatalogProductSet` to apply the pricing to.<br>An apply rule matches within the subset of the cart that fits the match rules (the match set).<br>An apply rule can only match once in the match set.<br>If not supplied, the pricing will be applied to all products in the match set.<br>Other products retain their base price, or a price generated by other rules. |
| `ExcludeProductsId` | `String` | Optional | `CatalogProductSet` to exclude from the pricing rule.<br>An exclude rule matches within the subset of the cart that fits the match rules (the match set).<br>An exclude rule can only match once in the match set.<br>If not supplied, the pricing will be applied to all products in the match set.<br>Other products retain their base price, or a price generated by other rules. |
| `ValidFromDate` | `String` | Optional | Represents the date the Pricing Rule is valid from. Represented in RFC3339 full-date format (YYYY-MM-DD). |
| `ValidFromLocalTime` | `String` | Optional | Represents the local time the pricing rule should be valid from. Represented in RFC3339 partial-time format<br>(HH:MM:SS). Partial seconds will be truncated. |
| `ValidUntilDate` | `String` | Optional | Represents the date the Pricing Rule is valid until. Represented in RFC3339 full-date format (YYYY-MM-DD). |
| `ValidUntilLocalTime` | `String` | Optional | Represents the local time the pricing rule should be valid until. Represented in RFC3339 partial-time format<br>(HH:MM:SS). Partial seconds will be truncated. |
| `ExcludeStrategy` | [`String`](/doc/models/exclude-strategy.md) | Optional | Indicates which products matched by a CatalogPricingRule<br>will be excluded if the pricing rule uses an exclude set. |

### Example (as JSON)

```json
{
  "name": null,
  "time_period_ids": null,
  "discount_id": null,
  "match_products_id": null,
  "apply_products_id": null,
  "exclude_products_id": null,
  "valid_from_date": null,
  "valid_from_local_time": null,
  "valid_until_date": null,
  "valid_until_local_time": null,
  "exclude_strategy": null
}
```

